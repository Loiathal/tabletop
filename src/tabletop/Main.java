
package tabletop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Commands.CommandReceiver;


import java.util.Iterator;

import java.util.PriorityQueue;




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
        
        
        
//        AbilityCheckTest(character);
        System.out.println();
        System.out.println();
        
        
        
        StaticModifier beltOfGiantStrength = new StaticModifier(2, "_str", "Enhancement");
        StaticModifier beltOfGiantDexterity = new StaticModifier(-2, "_dex", "Enhancement");
        
        ModifierList herp = new ModifierList();
        System.out.println(herp.size());
        herp.addModifier(beltOfGiantStrength);
        herp.addModifier(beltOfGiantStrength);
        herp.addModifier(beltOfGiantDexterity);
        System.out.println(herp.size());
        
        character.listModifierAdd(beltOfGiantStrength);
 
        AttackTest(character);

    }
    
    
    
    
    public static void AttackTest(CommandReceiver character)
    {
        //Create a new attack: A longsword
        DynamicModifier longswordDamage = new DynamicModifier(1, 8, "Damage", "Longsword");
        ArrayList longswordDamageList = new ArrayList();
        longswordDamageList.add(longswordDamage);
        StaticModifier noAttackBonus = new StaticModifier(0, "Attack", "Untyped");
        Attack longsword = new Attack("Longsword", noAttackBonus, Attack.MELEE, "_str", Attack.ONE_HANDED, longswordDamageList);
        StaticModifier noDamageBonus = new StaticModifier(0, "Damage", "Untyped");
        character.listAttackAdd(longsword);
        
        //Note, getModifiedAbilityScore doesn't work yet.
        character.Attack("Longsword", 0, noDamageBonus);
        System.out.println();
        System.out.println();
        
        //Now let's add some modifiers to test attack further.
        StaticModifier Haste = new StaticModifier(1, "Melee Attack", "Haste");
        character.listModifierAdd(Haste);
        StaticModifier WeaponFocus = new StaticModifier(1, "Longsword Attack", "Weapon Focus");
        character.listModifierAdd(WeaponFocus);
        DynamicModifier flamingLongsword = new DynamicModifier(1,8,"Longsword Damage" , "Flaming Weapon");
        longswordDamageList.add(flamingLongsword);
        character.Attack("Longsword", 2, noDamageBonus);
    }
    
    public static void AbilityCheckTest(CommandReceiver character)
    {        
        StaticModifier strengthCheckBonus = new StaticModifier(2, "str Check", "Brute Gauntlets");
        character.listModifierAdd(strengthCheckBonus);
        character.Check("str", 5);
    }
        
}