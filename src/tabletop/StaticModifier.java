/*
 * This is for a modifier which applies to a roll.
 */
package tabletop;

/**
 *
 * @author Zach McAnally, Bryan Burke
 */


public class StaticModifier extends Modifier{
    private int modifierValue;
    private String modifies;
    private String modifierType;
    private boolean active;
    

    
    
    public StaticModifier (int value, String appliesTo, String type, boolean active)
    {
        modifierValue = value;
        modifies = appliesTo;
        modifierType = type;
        this.active = active;
    }
    
    @Override
    public int getValue(){
        return modifierValue;
    }
    
    @Override
    public String getAppliesTo(){
        return modifies;
    }
    
    @Override
    public String getType(){
        return modifierType;
    }
    
    @Override
    public boolean getActive()
    {
        return active;
    }
    
    @Override
    public void setValue(int value){
        modifierValue = value;
    }
    
    @Override
    public void printModifier() {
        System.out.println("Value: " + modifierValue);
        System.out.println("Applies To: " + modifies);
        System.out.println("Type: " + modifierType);
        System.out.println();
    }
    
}