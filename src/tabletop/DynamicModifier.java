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
    private int active;
    
    public DynamicModifier(int dieNumber, int die, String appliesTo, String type, int active)
    {
        numberOfDice = dieNumber;
        dieType = die;
        modifies = appliesTo;
        modifierType = type;        
        this.active = active;
    }
    
    //Needs to do a die roll.1
    @Override
    public int getValue(){
        return Die.rollDie(dieType, numberOfDice);
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
    public int getActive()
    {
        return active;
    }
    
    @Override
    public void setValue(String value)
    {
        int DPlace = value.indexOf("d");
        numberOfDice = Integer.parseInt(value.substring(0, DPlace));
        dieType = Integer.parseInt(value.substring(DPlace+1));
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
