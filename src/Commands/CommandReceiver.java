/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author Zachary
 */ 

import tabletop.CharacterWrapper;
import tabletop.Attack;
import tabletop.Die;

import tabletop.DynamicModifier;
import tabletop.StaticModifier;
import tabletop.Modifier;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;

public class CommandReceiver {
    
    CharacterWrapper character = new CharacterWrapper();
    
    public CommandReceiver(CharacterWrapper character)
    {
        this.character = character;
    }

    //Begin Bryan's commands
    
    public void FieldSet(String field, String value)
    {
        switch (field){
            case "name":
                character.setCharacterName(value);
                break;
            case "race":
                character.setCharacterRace(value);
                break;
            case "classlvl":
                character.setClasslvl(value);
                break;
            case "size":
                character.setSizeCategory(value);
                break;
            case "favoredClass":
                character.setFavoriteClass(value);
                break;
            case "notes":
                character.setNotes(value);
                break;
            case "status":
                character.setStatus(value);
            default:
                System.out.println("Not a Valid Option");
        }
    }

    public void FieldSet(String field, int value)
    {
        switch (field){
            case "ECL":
                character.setEffectiveCharacterLevel(value);
                break;
            case "reach":
                character.setRange(value);
                break;
            case "_str":
                character.setAbilityScore(field, value);
                break;
            case "_dex":
                character.setAbilityScore(field, value);
                break;
            case "_con":
                character.setAbilityScore(field, value);
                break;
            case "_int":
                character.setAbilityScore(field, value);
                break;
            case "_wis":
                character.setAbilityScore(field, value);
                break;
            case "_cha":
                character.setAbilityScore(field, value);
                break;
            case "HP":
                character.setBaseHealth(value);
                break;
            case "fortsave":
                character.setSavingThrow(field, value);
                break;
            case "refsave":
                character.setSavingThrow(field, value);
                break;
            case "willsave":
                character.setSavingThrow(field, value);
                break;
            case "BAB":
                character.setBaseAttackBonus(value);
                break;
            case "characterWeight":
                character.setWeight(value);
                break;
            case "movespeed":
                character.setSpeed(value);
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }

    public void FieldChange(String field, int value)
    {
        switch (field){
            case "ECL":
                character.setEffectiveCharacterLevel(character.getEffectiveCharacterLevel() + value);
                break;
            case "reach":
                character.setRange(character.getRange() + value);
                break;
            case "_str":
                character.setAbilityScore(field, character.getAbilityScore(field) + value);
                break;
            case "_dex":
                character.setAbilityScore(field, character.getAbilityScore(field) + value);
                break;
            case "_con":
                character.setAbilityScore(field, character.getAbilityScore(field) + value);
                break;
            case "_int":
                character.setAbilityScore(field, character.getAbilityScore(field) + value);
                break;
            case "_wis":
                character.setAbilityScore(field, character.getAbilityScore(field) + value);
                break;
            case "_cha":
                character.setAbilityScore(field, character.getAbilityScore(field) + value);
                break;
            case "HP":
                character.setBaseHealth(character.getBaseHealth() + value);
                break;
            case "fortsave":
                character.setSavingThrow(field, character.getSavingThrow(field) + value);
                break;
            case "refsave":
                character.setSavingThrow(field, character.getSavingThrow(field) + value);
                break;
            case "willsave":
                character.setSavingThrow(field, character.getSavingThrow(field) + value);
                break;
            case "BAB":
                character.setBaseAttackBonus(character.getBAB() + value);
                break;
            case "characterWeight":
                character.setWeight(character.getWeight() + value);
                break;
            case "movespeed":
                character.setSpeed(character.getSpeed() + value);
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }
    
    public void listAdd(String field, String item){
        switch (field) {
            case "language":
                character.addLanguage(item);
                break;
            case "special":
                character.addSpecial(item);
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }

    public void listRemove(String field, String item){
        switch (field){
            case "language":
                character.removeLanguage(item);
                break;
            case "special":
                character.removeLanguage(item);
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }
    
    //Begin Zach's commands
    
    
    //Need to add damage
    public void Attack(String attack, Modifier attackModifier, Modifier damageModifier)
    {
  //      List attackList = character.getAttackList();
  //      List modifierList = character.getModifierList();
          


        //Adding an attack to the list for testing purposes
        List<Attack> attackList = new ArrayList<>();
        List<Modifier> modifierList = new ArrayList<>();

        StaticModifier Flanking = new StaticModifier(2, "Melee Attack", "Flanking");
        DynamicModifier longswordDamage = new DynamicModifier(1, 8, "Melee Damage", "Longsword Damage");
        ArrayList longswordDamageList = new ArrayList();
        longswordDamageList.add(longswordDamage);

        Attack longswordAttack = new Attack("Longsword", Flanking, "Melee", 
                "Str", "One", longswordDamageList);
        attackList.add(longswordAttack);

        StaticModifier hasteBonus = new StaticModifier(1, "Melee Attack", "Untyped");
        StaticModifier longswordWeaponFocus = new StaticModifier(1, "Longsword Attack", "Untyped");
        
        modifierList.add(Flanking);
        modifierList.add(hasteBonus);
        modifierList.add(longswordWeaponFocus);

        //End testcode adding

        if (attack.equals("Full"))
        {
            //do a full attack, looping through the list of attacks
            //I believe this works, running recursively through the command. However,
            //since I'm creating my test data at the moment in the command, I can't
            //test full attack yet.
            Iterator attackIterator = attackList.iterator();
            while(attackIterator.hasNext())
            {
                Attack currentAttack = (Attack)attackIterator.next();
                Attack(currentAttack.getAttackName(), attackModifier, damageModifier);
            }
        }

        Iterator attackIterator = attackList.iterator();
        while(attackIterator.hasNext())
        {
            Attack currentAttack = (Attack)attackIterator.next();
            if (currentAttack.getAttackName().equals(attack))
            {
                //perform attack

                //D20 Roll
                System.out.println("Performing Attack: " + attack);
                int totalAttackRoll = 0;
                int dieRoll = Die.rollDie(20, 1);
                System.out.println("D20 roll: " + dieRoll);
                totalAttackRoll = totalAttackRoll + dieRoll;

                //Search for and add any applicable modifiers
                //An applicable modifier is the modifier BAB, from stat
                //(currentAttack.getApplyingStat(),
                //any modifier that applies to "Melee Attack" or "Ranged Attack"
                //(as appropriate), or one that is named "<attack name> Attack"


                totalAttackRoll = totalAttackRoll + character.getBAB();

                System.out.println("Current Total Attack Bonus after BAB: " + totalAttackRoll);

                totalAttackRoll = totalAttackRoll + character.modifiedAbilityScore(currentAttack.getapplyingStat());

                System.out.println("Current Total Attack Bonus after Strength: " + totalAttackRoll);

                Iterator modifierIterator = modifierList.iterator();
                while(modifierIterator.hasNext())
                {
                    Modifier currentModifier = (Modifier)modifierIterator.next();

                    //perform check to see if this modifier applies to current attack
                    //by being Melee or Ranged.
                    if (currentModifier.getAppliesTo().equals(currentAttack.getAttackType() + " Attack"))
                    {
                        int attackModifierBonus = currentModifier.getValue();
                        totalAttackRoll = totalAttackRoll + attackModifierBonus;
                        System.out.println("Bonus from " + currentModifier.getType() + ": " + attackModifierBonus);
                    }
                    //perform check to see if this modifier applies to current attack
                    //by applying specifically to this attack (weapon focus, for instance)
                    if (currentModifier.getAppliesTo().equals(currentAttack.getAttackName() + " Attack"))
                    {
                       int attackModifierBonus = currentModifier.getValue();
                       totalAttackRoll = totalAttackRoll + attackModifierBonus;
                       System.out.println("Bonus from " + currentModifier.getType() + ": " + attackModifierBonus);
                    }
                }
                
                System.out.println("Current Total Attack Bonus after all bonuses: " + totalAttackRoll);
                
                
                //Do damage for this attack for which the attack bonus was just printed.
                //Pull the damage for the attack, roll dice for it, add the passed in 
                //misc modifiers, and then add other applicable modifiers from the list.
                //Remember to base the strength on results from getHanded().
                
                System.out.println("Rolling Damage: ");
                List damage = currentAttack.getAttackDamage();
                int totalDamage = 0;
                
                //Walk through the list of damage modifiers, getValue each one and add
                //The result to the total damage. Print a message for each also.
                Iterator damageIterator = damage.iterator();
                while(damageIterator.hasNext())
                {
                    Modifier currentDamage = (Modifier)damageIterator.next();
                    int damageRollResult = currentDamage.getValue();
                    System.out.println(currentDamage.getType() + " damage = " + damageRollResult);
                    totalDamage = totalDamage + damageRollResult;
                }
                
                //Add Strength. Base results on getHanded().
                int strengthDamageBonus = character.modifiedAbilityScore("str");
                switch(currentAttack.getHanded())
                {
                    case "One":
                        //Do nothing
                    case "Two":
                        //Not worried about casting double to int
                        strengthDamageBonus = (int)Math.floor(strengthDamageBonus * 1.5);
                    case "Off":
                        strengthDamageBonus = (int)Math.floor(strengthDamageBonus * .5);
                        break;
                }
                totalDamage = totalDamage + strengthDamageBonus;
                
                //Check list of character modifiers for any that apply to damage.
                //A valid modifier is one that applies to "Melee Damage" or 
                //"Ranged Damage" as appropriate, or that applies to 
                //"<Attack Name> Damage".
                
                Iterator damageModifierIterator = modifierList.iterator();
                while (damageModifierIterator.hasNext())
                {
                    Modifier currentDamage = (Modifier)damageIterator.next();
                    //See if the modifier applies to the damage by applying to 
                    //"Melee Damage" or "Ranged Damage"
                    if (currentDamage.getAppliesTo().equals(currentAttack.getAttackType() + " Damage"))
                    {
                        //apply it
                        int damageRollResult = currentDamage.getValue();
                        System.out.println(currentDamage.getType() + " damage = " + damageRollResult);
                        totalDamage = totalDamage + damageRollResult;
                    }
                    
                    //See if the modifier applies by applying to "<Attack Name> Damage"
                    if (currentDamage.getAppliesTo().equals(currentAttack.getAttackName() + " Damage"))
                    {
                        //print and apply to total
                        int damageRollResult = currentDamage.getValue();
                        System.out.println(currentDamage.getType() + " damage = " + damageRollResult);
                        totalDamage = totalDamage + damageRollResult;
                    }
                }
                
                //Add the passed in Modifier.
                
                int damageModifierRoll = damageModifier.getValue();
                System.out.println(damageModifier.getType() + " damage = " + damageModifierRoll);
                totalDamage = totalDamage + damageModifierRoll;
                
                //Print Damage.
                System.out.println("Total Damage: " + totalDamage);
                
            }
            else
            {
                //do nothing
            }
            
        }
    }

    public int CastSpell()
    {
        return 0;
    }


    public void Check()
    {
        
    }




}
