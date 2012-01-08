/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author Zachary
 */

import tabletop.CoreCharacter;
public class CommandReceiver {
    
    
    //Begin Bryan's commands
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
    
    
    
    //Begin Zach's commands
    public String Attack() 
    {        
        return "derp";
    }
    
    public int CastSpell()
    {
        return 0;
    }
    
    
    
    
    
    
}
