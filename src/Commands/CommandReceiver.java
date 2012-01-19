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
    
    CharacterWrapper character;
    
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
                break;
            default:
                System.out.println("Not a Valid Option");
                break;
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
                character.setBAB(value);
                break;
            case "characterWeight":
                character.setWeight(value);
                break;
            case "movespeed":
                character.setSpeed(value);
                break;
            default:
                System.out.println("Not a Valid Option");
                break;
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
                character.setAbilityScore(field, character.getBaseAbilityScore(field) + value);
                break;
            case "_dex":
                character.setAbilityScore(field, character.getBaseAbilityScore(field) + value);
                break;
            case "_con":
                character.setAbilityScore(field, character.getBaseAbilityScore(field) + value);
                break;
            case "_int":
                character.setAbilityScore(field, character.getBaseAbilityScore(field) + value);
                break;
            case "_wis":
                character.setAbilityScore(field, character.getBaseAbilityScore(field) + value);
                break;
            case "_cha":
                character.setAbilityScore(field, character.getBaseAbilityScore(field) + value);
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
                character.setBAB(character.getBAB() + value);
                break;
            case "characterWeight":
                character.setWeight(character.getWeight() + value);
                break;
            case "movespeed":
                character.setSpeed(character.getSpeed() + value);
                break;
            default:
                System.out.println("Not a Valid Option");
                break;
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
                break;
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
                break;
        }
    }
    
    
    
    //Begin Zach's commands
    
    public void listAttackAdd(Attack newAttack)
    {
        character.addAttack(newAttack);
    }
    
    public void listAttackRemove(Attack attack)
    {
        character.removeAttack(attack);
    }
    
    public void listModifierAdd(Modifier newModifier)
    {
        character.addModifier(newModifier);
    }
    
    public void listModifierRemove(Modifier modifierName)
    {
        character.removeModifier(modifierName);
    }
    
    public void Attack(String attack, int attackModifier, Modifier damageModifier)
    {
        List attackList = character.getAttackList();
        List modifierList = character.getModifierList();

        if (attack.equals("Full"))
        {
            //do a full attack, looping through the list of attacks
            //I believe this works, running recursively through the command. However,
            //since I'm creating my test data at the moment in the command, I can't
            //test full attack yet.
            for (int i = 0; i < attackList.size(); i++)
            {
                Attack currentAttack = (Attack)attackList.get(i);
                Attack(currentAttack.getAttackName(), attackModifier, damageModifier);
            }
        }

        for (int i = 0; i < attackList.size(); i++)
        {
            Attack currentAttack = (Attack)attackList.get(i);
            String currentAttackType;
            String currentDamageType;
            if (currentAttack.getAttackType() == Attack.MELEE)
            {
                currentAttackType = "Melee Attack";
                currentDamageType = "Melee Damage";
            }
            else
            {
                currentAttackType = "Ranged Attack";
                currentDamageType = "Ranged Damage";
            }
            
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


                System.out.println("BAB: " + character.getBAB());
                totalAttackRoll = totalAttackRoll + character.getBAB();
                
                totalAttackRoll = totalAttackRoll + character.getModifiedAbilityScore(currentAttack.getapplyingStat());

                for (int j = 0; j < modifierList.size(); j++)
                {
                    Modifier currentModifier = (Modifier)modifierList.get(j);
                    
                    if (currentModifier.getActive() == Modifier.ACTIVE)
                    {
                        //perform check to see if this modifier applies to current attack
                        //by being Melee or Ranged.
                        if (currentModifier.getAppliesTo().equals(currentAttackType))
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
                }   
                
                int miscAttackBonus = currentAttack.getAttackBonus().getValue();
                System.out.println("Bonus specific to attack: " + miscAttackBonus);
                totalAttackRoll = totalAttackRoll + miscAttackBonus;                
                
                System.out.println("Bonus from misc: " + attackModifier);
                totalAttackRoll = totalAttackRoll + attackModifier;
                
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
                
                for (int j = 0; j < damage.size(); j++)
                {
                    Modifier currentDamage = (Modifier)damage.get(j);
                    if (currentDamage.getActive() == Modifier.ACTIVE)
                    {
                        int damageRollResult = currentDamage.getValue();
                        System.out.println(currentDamage.getType() + " damage = " + damageRollResult);
                        totalDamage = totalDamage + damageRollResult;
                    }
                }
                
                //Add Strength. Base results on getHanded().
                int strengthDamageBonus = character.getModifiedAbilityScore("str");
                switch(currentAttack.getHanded())
                {
                    
                    case Attack.ONE_HANDED:
                        //Do nothing
                        break;
                    case Attack.TWO_HANDED:
                        //Not worried about casting double to int
                        strengthDamageBonus = (int)Math.floor(strengthDamageBonus * 1.5);
                        break;
                    case Attack.OFF_HANDED:
                        strengthDamageBonus = (int)Math.floor(strengthDamageBonus * .5);
                        break;
                }
                totalDamage = totalDamage + strengthDamageBonus;
                
                //Check list of character modifiers for any that apply to damage.
                //A valid modifier is one that applies to "Melee Damage" or 
                //"Ranged Damage" as appropriate, or that applies to 
                //"<Attack Name> Damage".
                
                for (int j = 0; j < modifierList.size(); j++)
                {
                    Modifier currentDamage = (Modifier)modifierList.get(j);
                    
                    if (currentDamage.getActive() == Modifier.ACTIVE)
                    {
                        //See if the modifier applies to the damage by applying to 
                        //"Melee Damage" or "Ranged Damage"
                        if (currentDamage.getAppliesTo().equals(currentDamageType))
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
                }
                
                //Add the passed in Modifier.
                
                int damageModifierRoll = damageModifier.getValue();
                System.out.println("Damage from misc bonuses: " + damageModifierRoll);
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

    public void CastSpell()
    {
        
    }


    public void Check(String check, int modifier)
    {
        switch(check)
        {
            case "str":
                AbilityCheck("_str", modifier);
                break;
            case "dex":
                AbilityCheck("_dex", modifier);
                break;
            case "con":
                AbilityCheck("_con", modifier);
                break;
            case "int":
                AbilityCheck("_int", modifier);
                break;
            case "wis":
                AbilityCheck("_wis", modifier);
                break;
            case "cha":
                AbilityCheck("_cha", modifier);
                break;
            default:
                SkillCheck(check, modifier);
                break;
        }
    }
    
    public void SkillCheck(String check, int modifier)
    {
        
    }
    
    public void AbilityCheck(String check, int modifier)
    {
        int totalCheckResult = 0;
        System.out.println("Performing Check: " + check.substring(1));
        
        int dieRoll = Die.rollDie(20, 1);
        totalCheckResult += dieRoll;
        System.out.println("D20 Roll: " + dieRoll);
        
        //Add ability modifier.
        System.out.println("Ability Modifier: " + character.getModifiedAbilityModifier(check));
        
        //Add any modifiers to ability checks.
        
        List modifierList = character.getModifierList();
        for (int i = 0; i < modifierList.size(); i++)
        {
            Modifier currentModifier = (Modifier)modifierList.get(i);
            
            if (currentModifier.getActive() == Modifier.ACTIVE)
            {
                //Check to see if the modifier applies. Modifiers that apply are ones that 
                //apply to "<ability> Check"
                if (currentModifier.getAppliesTo().equals(check.substring(1) + " Check"))
                {
                    int modifierValue = currentModifier.getValue();
                    System.out.println("Bonus from " + currentModifier.getType() + " : " + modifierValue);
                    totalCheckResult += modifierValue;
                }
                
            }            
        }
                    
        //Add the passed in modifier.
        System.out.println("Miscellaneous bonuses: " + modifier);
        totalCheckResult += modifier;
        
        System.out.println("Total Check Result: " + totalCheckResult);   
    }
    
}
