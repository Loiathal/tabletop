/*
 * A piece of equipment is an item that takes up a slot on the body, or is slotless like
 * an ioun stone.
 */
package tabletop;

import java.util.List;
import java.util.Iterator;

//Comment
/**
 *
 * @author Zach McAnally, Bryan Burke
 */
public class Equipment extends Item{
    private int slot;
    
    public Equipment(String type, String itemName, int bodySlot, List listofModifiers, int itemWeight, String itemDescription){
        super (type, itemName, listofModifiers, itemWeight, itemDescription);
        slot = bodySlot;
    }
    
    public int getBodySlot(){
        return slot;
    }
    
    @Override
    public void printItem(){
        System.out.println("Name: " + name);
        System.out.println("Item Type: " + itemType);
        System.out.println("Body Slot: " + slot);
        System.out.println("Item Weight: " + weight);
        if (!modifierList.isEmpty())
        {
            System.out.println();
            System.out.println("Modifiers: ");
            Iterator modifierIterator = modifierList.iterator();
            while(modifierIterator.hasNext())
                {
                    Modifier modifierObject=(Modifier)modifierIterator.next();
                    modifierObject.printModifier();
                }
        }
        System.out.println("Description: " + description);
    }
}
