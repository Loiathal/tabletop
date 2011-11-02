/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package tabletop;

/**
 *
 * @author zmcanally
 */
public class Modifier {
    private int modifierValue;
    private String modifies;
    private String modifierType;
    
    public Modifier (int value, String appliesTo, String type)
    {
        modifierValue = value;
        modifies = appliesTo;
        modifierType = type;
    }
    public int getValue(){
        return modifierValue;
    }
    public String getAppliesTo(){
        return modifies;
    }
    public String getType(){
        return modifierType;
    }
    public void printModifier() {
        System.out.println("Value: " + modifierValue);
        System.out.println("Applies To: " + modifies);
        System.out.println("Type: " + modifierType);
    }
    
}