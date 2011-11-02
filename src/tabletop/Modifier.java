/*
 * This is for a modifier which applies to a roll.
 */
package tabletop;

/**
 *
 * @author Zach McAnally, Bryan Burke
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
        System.out.println();
    }
    
}