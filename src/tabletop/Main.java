
package tabletop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
         
        DynamicModifier FlamingSwordDamage = new DynamicModifier(1, 6, "Damage", "Untyped");
        
        FlamingSwordDamage.printModifier();
        
 
        ArrayList acrobaticsModifiers = new ArrayList();
        StaticModifier acrobaticsModifier1 = new StaticModifier(2, "Jump", "Untyped");
        StaticModifier acrobaticsModifier2 = new StaticModifier (2, "Tumble", "Untyped");
        //Modifier acrobaticsModifier1 = new Modifier(2, "Jump", "Untyped");
        //Modifier acrobaticsModifier2 = new Modifier(2, "Tumble", "Untyped");
        acrobaticsModifiers.add(acrobaticsModifier1);
        acrobaticsModifiers.add(acrobaticsModifier2);
        
        Feat Acrobatics = new Feat("Acrobatics", "Please only take it once", acrobaticsModifiers, 1, "PHB");
        Acrobatics.printFeat();
        
        System.out.println("");
        
        Skill Skill1 = new Skill("Jump", 15, "Strength", "yes", "class-skill");
        Skill1.printSkill();
    
        ArrayList kitModifiers = new ArrayList();
       // Modifier Modifier1 = new Modifier(2, "Open Lock", "Untyped");
        //Modifier Modifier2 = new Modifier(4, "Attack", "Morale");
        //kitModifiers.add(Modifier1);
        //kitModifiers.add(Modifier2);
        
        Item masterworkThievesKit = new Item("Tool", "Thieves Kit", kitModifiers, 5, "Helps you open shit.");
        masterworkThievesKit.printItem();
        System.out.println();
        
        ArrayList magicSwordModifiers = new ArrayList();
       // Modifier SwordModifier1 = new Modifier(5, "Attack", "Enhancement");
        //Modifier SwordModifier2 = new Modifier(5, "Damage", "Enhancement");
        //Modifier SwordModifier3 = new Modifier(3, "Fire Damage", "Enhancement");
        //magicSwordModifiers.add(SwordModifier1);
        //magicSwordModifiers.add(SwordModifier2);
        //magicSwordModifiers.add(SwordModifier3);
        
        Equipment magicSword = new Equipment("Weapon", "+5 flaming longsword", "Hand", magicSwordModifiers, 2, "Hits stuff.");
        magicSword.printItem();
        System.out.println();
        
        
        Spell PowerWordBlind = new Spell("Power Word Blind", "Arcane and Divine", "Enchantment (Compulsion)", "Mind-Affecting", "Sorcerer/Wizard 7, War Domain 7", "Verbal", "Standard", "Personal", "1 Creature with or under 200HP", "See Text", "None", true);
        PowerWordBlind.printSpell();

        
        Spell DeathWard = new Spell("Death Ward", "Divine", "Necromancy", "None", "Cleric 4, Death Domain 4, Druid 5, Paladin 4", "Verbal, Somatic, Divine Focus", "Standard", "Touch", "Living Creature Touched", "1 Minute per Level", "Will Negates (Harmless)", true);
        DeathWard.printSpell();
        
    }
}
