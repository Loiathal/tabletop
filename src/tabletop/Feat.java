/*
 * Zachary McAnally
 * 
 * This object contains a Feat, as well as various information about it.
 * 
 * Still needs to contain modifier data-- ie. that Weapon Focus gives a +1 to attack, etc.
 */

package tabletop;


public class Feat {
    private String name;
    private String description;
    private Modifier modifier;
    private int levelTaken;
    private String sourcebook;
    
    public Feat(String featName, String featDescription, Modifier newModifier, int level, String source)
    {
        name = featName;
        description = featDescription;
        levelTaken = level;
        sourcebook = source;
        modifier = newModifier;
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
    
    public Modifier getModifier(){
        return modifier;
    }
    
    public void printFeat() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        if (modifier != null)
        {
            System.out.println("Modifier: ");
            modifier.printModifier();
        }
        System.out.println("Level Taken: " + levelTaken);
        System.out.println("Sourcebook: " + sourcebook);
    }
}
