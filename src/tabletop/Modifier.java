/*
 * This is an adapter object which is called, and in turn calls Static and 
 * Dynamic modifiers depending on what it is given.
 */
package tabletop;

/**
 *
 * @author zmcanally
 */

import java.util.Comparator;

public abstract class Modifier implements Comparator<Modifier>{
    
    public static final boolean ACTIVE = true;
    public static final boolean NOT_ACTIVE = false;
    
    public Modifier(){
        
    }
    
    public abstract int getValue();
    
    public abstract String getAppliesTo();
    
    public abstract String getType();
    
    public abstract boolean getActive();
    
    public void setValue(int value){}
    
    public void setValue(String value){}
    
    public abstract void printModifier();
    
    @Override
    public int compare(Modifier x, Modifier y)
    {
        if (x.getValue() > y.getValue())
        {
            return 1;
        }
        else if (x.getValue() < y.getValue())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
}


