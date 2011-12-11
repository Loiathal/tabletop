/*
 *This is a modifier which applies to a roll, but is not known ahead of time, because
 * it relies on a die roll. (i.e. +1d6 damage)
 */
package tabletop;

/**
 *
 * @author zmcanally
 */
public class DynamicModifier extends Modifier{
    private int numberOfDice;
    private int dieType;
    private String modifies;
    private String modifierType;
    
    public DynamicModifier(int dieNumber, int die, String appliesTo, String type)
    {
        numberOfDice = dieNumber;
        dieType = die;
        modifies = appliesTo;
        modifierType = type;        
    }
    
    //Needs to do a die roll.
    public int getValue(){
        return 0;
    }
    
    public String getAppliesTo(){
        return modifies;
    }
    public String getType(){
        return modifierType;
    }
    
    @Override
    public void printModifier() {
        System.out.println("Value: " + numberOfDice + "d" + dieType);
        System.out.println("Applies To: " + modifies);
        System.out.println("Type: " + modifierType);
        System.out.println("Total: " + getValue());
        System.out.println();
    }
    
}
