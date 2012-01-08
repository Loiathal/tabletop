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

public class CommandReceiver {


    private static CharacterWrapper character;

    //Begin Bryan's commands
    /*
    public void FieldSet(String field, String value)
    {
        switch (field){
            case "name":
                CoreCharacter.setCharacterName(value);
                break;
            case "race":
                break;
            case "classlvl":
                break;
            case "size":
                break;
            case "favoredClass":
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }

    public void FieldChange(String field, String value)
    {

    }

    public void FieldSet(String field, int value)
    {
        switch (field){
            case "ECL":
                break;
            case "reach":
                break;
            case "_str":
                break;
            case "_dex":
                break;
            case "_con":
                break;
            case "_int":
                break;
            case "_wis":
                break;
            case "_cha":
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }

    public void FieldChange(String field, int value)
    {

    }

    */

    //Begin Zach's commands
    public static void Attack(String attack)
    {
  //      List attackList = character.getAttackList();
  //      List modifierList = character.getModifierList();


        //Adding an attack to the list for testing purposes
        List<Attack> attackList = new ArrayList<>();
        List<Modifier> modifierList = new ArrayList<>();

        StaticModifier Flanking = new StaticModifier(2, "Melee Attack", "Untyped");
        DynamicModifier longswordDamage = new DynamicModifier(1, 8, "Melee Attack", "Untyped");
        ArrayList longswordDamageList = new ArrayList();
        longswordDamageList.add(longswordDamage);

        Attack longswordAttack = new Attack("Longsword", Flanking, "Melee Attack", "Str", longswordDamageList);
        attackList.add(longswordAttack);

        StaticModifier hasteBonus = new StaticModifier(1, "Melee Attack", "Untyped");
        StaticModifier longswordWeaponFocus = new StaticModifier(1, "Longsword Attack", "Untyped");
        
        modifierList.add(hasteBonus);
        modifierList.add(longswordWeaponFocus);


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
                Attack(currentAttack.getAttackName());
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
                //(as appropriate), or one that is named either
                //<attack name> or <attack name> + "Attack"


                totalAttackRoll = totalAttackRoll + 5;  //Replace this back later-- testing only
                //totalAttackRoll = totalAttackRoll + character.getBAB();

                System.out.println("Current Total Attack Bonus after BAB: " + totalAttackRoll);

                totalAttackRoll = totalAttackRoll + 2;      //Replace back later
                //totalAttackRoll = totalAttackRoll + character.modifiedAbilityScore(currentAttack.getapplyingStat());

                System.out.println("Current Total Attack Bonus after Strength: " + totalAttackRoll);

                Iterator modifierIterator = modifierList.iterator();
                while(modifierIterator.hasNext())
                {
                    Modifier currentModifier = (Modifier)modifierIterator.next();

                    //perform check to see if this modifier applies to current attack
                    //by being Melee or Ranged.
                    if (currentModifier.getAppliesTo().equals(currentAttack.getAttackType()))
                    {
                        totalAttackRoll = totalAttackRoll + currentModifier.getValue();
                    }

                   System.out.println("Current Total Attack Bonus after Melee/Ranged: " + totalAttackRoll);
                    //perform check to see if this modifier applies to current attack
                    //by applying specifically to this attack (weapon focus, for instance)
                    if (currentModifier.getAppliesTo().equals(currentAttack.getAttackName() + " Attack"))
                    {
                        totalAttackRoll = totalAttackRoll + currentModifier.getValue();
                    }
                    System.out.println("Current Total Attack Bonus after Longsword bonus: " + totalAttackRoll);
                }
                
                System.out.println("Current Total Attack Bonus after all bonuses: " + totalAttackRoll);
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






}
