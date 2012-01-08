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

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CommandReceiver {

    private CharacterWrapper character;
    
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
    public void Attack(String attack) 
    {        
        List attackList = character.getAttackList();
                
        if (attack.equals("Full"))
        {
            //do a full attack, looping through the list of attacks
        }
        
        Iterator attackIterator = attackList.iterator();
        while(attackIterator.hasNext())
        {
            Attack currentAttack = (Attack)attackIterator.next();
            if (currentAttack.getAttackName().equals(attack))
            {
                //perform attack
                
                //D20 Roll
                System.out.println("Performing Attack " + attack);
                int totalAttackRoll = 0;
                int dieRoll = Die.rollDie(20, 1);
                System.out.println("D20 roll: " + dieRoll);
                totalAttackRoll = totalAttackRoll + dieRoll;
                
                //Search for and add any applicable modifiers
                //An applicable modifier is the modifier from stat
                //(currentAttack.getApplyingStat(),
                //any modifier that applies to "Melee Attack" or "Ranged Attack"
                //(as appropriate), or one that is named either 
                //<attack name> or <attack name> + "Attack"
                
                
                
                
                
                
                
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
