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
    
    
}
