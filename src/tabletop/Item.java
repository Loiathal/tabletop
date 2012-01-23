/*
 * This is an item, both worn equipment and held items.
 */
package tabletop;

import java.util.List;
import java.util.Iterator;

/**
 * @author Zach McAnally, Bryan Burke.
 */
public class Item {
   
    protected String itemType;
    protected String name;
    protected List modifierList;
    protected int weight;
    protected String description;
    
    public Item(String type, String itemName, List listofModifiers, int itemWeight, String itemDescription){
        itemType = type;
        name = itemName;
        modifierList = listofModifiers;
        weight = itemWeight;
        description = itemDescription;
    }
    
    public String getItemType(){
        return itemType;
    }
    
    public String getItemname(){
        return name;
    }
    
    public List getItemModifierList(){
        return modifierList;
    }
    
    public int getItemWeight(){
        return weight;
    }
    
    public String getItemDescription(){
        return description;
    }
    
    public void addModifier(Modifier newModifier)
    {
        modifierList.add(newModifier);
    }
    
    public void removeModifier(Modifier modifier)
    {
        modifierList.add(modifier);
    }
    
    public void printItem(){
        System.out.println("Name: " + name);
        System.out.println("Item Type: " + itemType);
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
