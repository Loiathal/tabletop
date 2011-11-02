/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletop;

/**
 *
 * @author Hashiikun
 */
public class Skill {

    private String name;
    private int ranks;
    private String modifier;
    private String penalty;
    private String availability;
    
    public Skill(String skillName, int totalRanks, String abilityMod, String armorCheck, String pointsNeeded) {
        name = skillName;
        ranks = totalRanks;
        modifier = abilityMod;
        penalty = armorCheck;
        availability = pointsNeeded;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRanks() {
        return ranks;
    }
    
    public String getModifier() {
        return modifier;
    }
    
    public String getPenalty() {
        return penalty;
    }
    
    public String getAvailability() {
        return availability;
    }
    public void printSkill() {
        System.out.println("Name: " + name);
        System.out.println("Ranks: " + ranks);
        System.out.println("Key Score: " + modifier);
        System.out.println("Armor Check Penalty: " + penalty);
        System.out.println("Availability: " + availability);
    }
}
