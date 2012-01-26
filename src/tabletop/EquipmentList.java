/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package tabletop;

/**
 *
 * @author zmcanally
 */

import java.util.Collections;
import java.util.List;

//The set function should not just set a piece of equipment to a slot, but also
//remove the existing equip in that slot(if any) and place it in the itemList.

//Things to be done--- write a function that adds the modifiers on the piece of equipment
//to the general modifier list, then call that function when equiping an item. Actually, this should probably be
//done in the commandreceiver. Let's probably not do that here.
public class EquipmentList {
    
    public static final int FACE = 0;
    public static final int HEAD = 1;
    public static final int BODY = 2;
    public static final int ARMS = 3;
    public static final int GLOVES = 4;
    public static final int PANTS = 5;
    public static final int BOOTS = 6;
    public static final int MISC_EQUIP = 7;
    
    private Equipment face;
    private Equipment head;
    private Equipment body;
    private Equipment arms;
    private Equipment gloves;
    private Equipment pants;
    private Equipment boots;
    private List miscEquipList;    
    
    public EquipmentList()
    {
       //Don't need to do anything with the constructor. 
    }
    
    public Equipment getEquip(int slot)
    {
        switch (slot)
        {
            case (FACE):
                return face;
            case (HEAD):
                return head;
            case (BODY):
                return body;
            case (ARMS):
                return arms;
            case (GLOVES):
                return gloves;
            case (PANTS):
                return pants;
            case (BOOTS):
                return boots;
            default:
                System.out.println("Invalid equipment slot given. Returning face slot.");
                return face;
        }
    }
    
    public List getEquipList()
    {
        return miscEquipList;
    }
    
    public void setEquip(Equipment equip)
    {
        switch (equip.getSlot())
        {
            case (FACE):
                face = equip;
                break;
            case (HEAD):
                head = equip;
                break;
            case (BODY):
                body = equip;
                break;
            case (ARMS):
                arms = equip;
                break;
            case (GLOVES):
                gloves = equip;
                break;
            case (PANTS):
                pants = equip;
                break;
            case (BOOTS):
                boots = equip;
                break;
            case (MISC_EQUIP):
                miscEquipList.add(equip);
                break;
            default:
                System.out.println("Invalid slot given. Nothing was set.");
                break;
        }
    }
    
    //Before using this function, it is important to add the equip in that slot
    //to the item list in the CharacterWrapper.
    public void removeEquip(Equipment item)
    {
        switch (item.getSlot())
        {
            case (FACE):
                face = emptyItem();
                break;
            case (HEAD):
                head = emptyItem();
                break;
            case (BODY):
                body = emptyItem();
                break;
            case (ARMS):
                arms = emptyItem();
                break;
            case (GLOVES):
                gloves = emptyItem();
                break;
            case (PANTS):
                pants = emptyItem();
                break;
            case (BOOTS):
                boots = emptyItem();
                break;
            case (MISC_EQUIP):
                miscEquipList.remove(item);
                break;
            default:
                System.out.println("No such item to dequip");
                break;
        }
    }
    
    public Equipment emptyItem()
    {
        Equipment emptyEquip = new Equipment("Nothing", "Empty Item", MISC_EQUIP, Collections.EMPTY_LIST, 0, "Nothing", 0);
        return emptyEquip;
    }
    
}
