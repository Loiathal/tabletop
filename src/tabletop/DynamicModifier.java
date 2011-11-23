/*
 *This is a modifier which applies to a roll, but is not known ahead of time, because
 * it relies on a die roll. (i.e. +1d6 damage)
 */
package tabletop;

/**
 *
 * @author zmcanally
 */
public class DynamicModifier {
    private int numberOfDice;
    private int dieType;
    private String modifies;
    private String modifierType;
    
    public DynamicModifier(String value, String appliesTo, String type){
        int locationOfd = value.indexOf("d");
        numberOfDice = Integer.parseInt(value.substring(0, locationOfd));
        dieType = Integer.parseInt(value.substring(locationOfd + 1));
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
    
    public void printDynamicModifier() {
        System.out.println("Value: " + numberOfDice + "d" + dieType);
        System.out.println("Applies To: " + modifies);
        System.out.println("Type: " + modifierType);
        System.out.println("Total: " + getValue());
        System.out.println();
    }
    
}
