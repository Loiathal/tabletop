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
   
    private String itemType;
    private String name;
    private List modifierList;
    private int weight;
    private String description;
    
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
            System.out.println();
            System.out.println("Description: " + description);
        }
    }
}
