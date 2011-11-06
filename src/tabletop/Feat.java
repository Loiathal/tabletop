/*
 * Zachary McAnally
 * 
 * This object contains a Feat, as well as various information about it.
 * 
 * Still needs to contain modifier data-- ie. that Weapon Focus gives a +1 to attack, etc.
 */

package tabletop;

import java.util.List;
import java.util.Iterator;

public class Feat {
    private String name;
    private String description;
    private List modifierList;
    private int levelTaken;
    private String sourcebook;
    
    
    public Feat(String featName, String featDescription, List listOfModifiers, int level, String source)
    {
        name = featName;
        description = featDescription;
        levelTaken = level;
        sourcebook = source;
        modifierList = listOfModifiers;
    }
    
    public String getFeatName() {
        return name;
    }
    
    public String getFeatDescription() {
        return description;
    }
    
    public int getLevelTaken() {
        return levelTaken;
    }
    
    public String getSourcebook() {
        return sourcebook;
    }
    
    public List getModifierList(){
        return modifierList;
    }
    
    public void printFeat() {
        System.out.println("Name: " + name);
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
        System.out.println();
        System.out.println("Level Taken: " + levelTaken);
        System.out.println("Sourcebook: " + sourcebook);
        System.out.println("Description: " + description);
    }
}
