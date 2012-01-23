
package tabletop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Commands.CommandReceiver;


import java.util.Iterator;




class Main {
    
    public static void main(String[] args) {
        
        CoreCharacter coreCharacter = new CoreCharacter();
        CharacterWrapper characterWrapper = new CharacterWrapper(coreCharacter);
        CommandReceiver character = new CommandReceiver(characterWrapper);
        
        character.FieldSet("_str", 14);
        character.FieldSet("_dex", 10);
        character.FieldSet("_con", 10);
        character.FieldSet("_int", 10);
        character.FieldSet("_wis", 10);     
        character.FieldSet("_cha", 10);     
        character.FieldSet("BAB", 4);
        
        //AbilityCheckTest(character);
        System.out.println();
        System.out.println();
        
        
        StaticModifier beltOfGiantStrength = new StaticModifier(2, "_str", "Enhancement", Modifier.ACTIVE);
        character.listModifierAdd(beltOfGiantStrength);
 
        AttackTest(character);
        
        
        
//        DynamicModifier longswordDamage = new DynamicModifier(1, 8, "Damage", "Longsword");
//        StaticModifier strengthDamage = new StaticModifier(4, "Damage", "Untyped");
//        StaticModifier attackBonus = new StaticModifier(7, "Attack", "Untyped");
//        ArrayList longswordDamageList = new ArrayList();
//        longswordDamageList.add(longswordDamage);
//        longswordDamageList.add(strengthDamage);
//        Attack longswordAttack = new Attack("Longsword", attackBonus, longswordDamageList);
//        
//        longswordAttack.printAttack();
        
        
        
//        DynamicModifier FlamingSwordDamage = new DynamicModifier(1, 6, "Damage", "Fire");
//      
//        FlamingSwordDamage.printModifier();
//        
//        
//        
// 
//        ArrayList acrobaticsModifiers = new ArrayList();
//        StaticModifier acrobaticsModifier1 = new StaticModifier(2, "Jump", "Untyped");
//        StaticModifier acrobaticsModifier2 = new StaticModifier (2, "Tumble", "Untyped");
//        acrobaticsModifiers.add(acrobaticsModifier1);
//        acrobaticsModifiers.add(acrobaticsModifier2);
//        
//        Feat Acrobatics = new Feat("Acrobatics", "Please only take it once", acrobaticsModifiers, 1, "PHB");
//        Acrobatics.printFeat();
//        
//        System.out.println("");
//        
//        Skill Skill1 = new Skill("Jump", 15, "Strength", "yes", "class-skill");
//        Skill1.printSkill();
//    
//        ArrayList kitModifiers = new ArrayList();
//        StaticModifier Modifier1 = new StaticModifier(2, "Open Lock", "Untyped");
//        StaticModifier Modifier2 = new StaticModifier(4, "Attack", "Morale");
//        kitModifiers.add(Modifier1);
//        kitModifiers.add(Modifier2);
//        
//        Item masterworkThievesKit = new Item("Tool", "Thieves Kit", kitModifiers, 5, "Helps you open shit.");        masterworkThievesKit.printItem();
//        System.out.println();
        

    }
    
        public static void AttackTest(CommandReceiver character)
    {
        //Create a new attack: A longsword
        DynamicModifier longswordDamage = new DynamicModifier(1, 8, "Damage", "Longsword", Modifier.ACTIVE);
        ArrayList longswordDamageList = new ArrayList();
        longswordDamageList.add(longswordDamage);
        StaticModifier noAttackBonus = new StaticModifier(0, "Attack", "Untyped", Modifier.ACTIVE);
        Attack longsword = new Attack("Longsword", noAttackBonus, Attack.MELEE, "_str", Attack.ONE_HANDED, longswordDamageList);
        StaticModifier noDamageBonus = new StaticModifier(0, "Damage", "Untyped", Modifier.ACTIVE);
        character.listAttackAdd(longsword);
        
        //Note, getModifiedAbilityScore doesn't work yet.
        character.Attack("Longsword", 0, noDamageBonus);
        System.out.println();
        System.out.println();
        
        //Now let's add some modifiers to test attack further.
        StaticModifier Haste = new StaticModifier(1, "Melee Attack", "Haste", Modifier.ACTIVE);
        character.listModifierAdd(Haste);
        StaticModifier WeaponFocus = new StaticModifier(1, "Longsword Attack", "Weapon Focus", Modifier.ACTIVE);
        character.listModifierAdd(WeaponFocus);
        DynamicModifier flamingLongsword = new DynamicModifier(1,8,"Longsword Damage" , "Flaming Weapon", Modifier.ACTIVE);
        longswordDamageList.add(flamingLongsword);
        character.Attack("Longsword", 2, noDamageBonus);
    }
    
        public static void AbilityCheckTest(CommandReceiver character)
        {        
            StaticModifier strengthCheckBonus = new StaticModifier(2, "str Check", "Brute Gauntlets", 1);
            character.listModifierAdd(strengthCheckBonus);
            character.Check("str", 5);
        }
        
}