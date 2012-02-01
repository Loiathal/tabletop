/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletop;

/**
 *
 * @author Zachary
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.List;


public class ModifierList {
    
    List<PriorityQueue> modifierList = new ArrayList<>();
    
    public ModifierList()
    {
        //Empty Constructor
    }
    
    public List getModifierList()
    {
        return modifierList;
    }
    
    public void addModifier(Modifier newModifier)
    {
        for (int i = 0; i < modifierList.size(); i++)
        {
            Modifier currentModifier = (Modifier)modifierList.get(i).peek();
            if (currentModifier.getAppliesTo().equals(newModifier.getAppliesTo()))
            {
                if (currentModifier.getType().equals(newModifier.getType()))
                {
                    //The new modifier applies to the same thing and is of
                    //the same type as a currently applying modifier. Add it to
                    //the existing queue. It will be automatically sorted.
                    modifierList.get(i).add(newModifier);
                    return;
                }
            }
            //If the new modifier doesn't match anything related to this one,
            //do nothing yet.
        }
        //If we didn't find a modifier that this one won't stack with, we 
        //should make a new priority queue, add it to the list, and add the 
        //new modifier to it.
        PriorityQueue<Modifier> myList = new PriorityQueue<Modifier>();
        myList.add(newModifier);
        modifierList.add(myList);
    }
    
    public void removeModifier(Modifier modifier)
    {
        for (int i = 0; i < modifierList.size(); i++)
        {
            Modifier currentModifier = (Modifier)modifierList.get(i).peek();
            
            if (currentModifier.getAppliesTo().equals(modifier.getAppliesTo()))
            {
                if (currentModifier.getType().equals(modifier.getType()))
                {
                    //We're looking at the correct priority queue. Just remove 
                    //the modifier. It will automatically re-sort the queue. If
                    //this leaves the queue empty, remove it from the list.
                    
                    modifierList.get(i).remove(modifier);
                    if (modifierList.get(i).size() == 0)
                    {
                        modifierList.remove(modifierList.get(i));
                    }
                }
            }
            //This queue isn't the one we want. Do nothing.
        }   
    }
    
    public int size()
    {
        return modifierList.size();
    }
    
    public Modifier get(int i)
    {
        return (Modifier)modifierList.get(i).peek();
    }
    
}
