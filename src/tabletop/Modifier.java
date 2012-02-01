/*
 * This is an adapter object which is called, and in turn calls Static and 
 * Dynamic modifiers depending on what it is given.
 */
package tabletop;

/**
 *
 * @author zmcanally
 */


public abstract class Modifier implements Comparable<Modifier>{
    
    public Modifier(){
        
    }
    
    public abstract int getValue();
    
    public abstract String getAppliesTo();
    
    public abstract String getType();
    
    public void setValue(int value){}
    
    public void setValue(String value){}
    
    public abstract void printModifier();
    
    //While this ordering is incredibly counterintuitive, it produces the desired
    //effect in the priority queue.
    public int compareTo(Modifier otherModifier)
    {
        if (this.getValue() > otherModifier.getValue())
        {
            return -1;
        }
        else if (this.getValue() < otherModifier.getValue())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
}


