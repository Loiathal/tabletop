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
    //modifier goes here
    private int levelTaken;
    private String sourcebook;
    
    //Need to add the initialization for modifier.
    public Feat(String featName, String featDescription, int level, String source) {
        name = featName;
        description = featDescription;
        levelTaken = level;
        sourcebook = source;
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
    
    public void printFeat() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Level Taken: " + levelTaken);
        System.out.println("Sourcebook: " + sourcebook);
    }
    
}
