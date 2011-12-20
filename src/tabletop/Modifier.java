/*
 * This is an adapter object which is called, and in turn calls Static and 
 * Dynamic modifiers depending on what it is given.
 */
package tabletop;

/**
 *
 * @author zmcanally
 */
public abstract class Modifier {
    
    public Modifier(){
        
    }
    
    public abstract int getValue();
    
    public abstract String getAppliesTo();
    
    public abstract String getType();
    
    public void setValue(int value){}
    
    public void setValue(String value){}
    
    public abstract void printModifier();
    
}


