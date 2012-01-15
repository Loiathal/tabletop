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

    public static final int CROSS_CLASS_SKILL = 0;
    public static final int CLASS_SKILL = 1;
    public static final int NO_ARMOR_CHECK = 0;
    public static final int ARMOR_CHECK_PENALTY = 1;
    
    private String name;
    private int ranks;
    private String modifier;
    private int penalty;
    private int classSkill;
    
    public Skill(String skillName, int totalRanks, String abilityMod, int armorCheck, int pointsNeeded) {
        name = skillName;
        ranks = totalRanks;
        modifier = abilityMod;
        penalty = armorCheck;
        classSkill = pointsNeeded;
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
    
    public int getPenalty() {
        return penalty;
    }
    
    public int getClassSkill() {
        return classSkill;
    }
    public void printSkill() {
        System.out.println("Name: " + name);
        System.out.println("Ranks: " + ranks);
        System.out.println("Key Score: " + modifier);
        System.out.println("Armor Check Penalty: " + penalty);
        System.out.println("Availability: " + classSkill);
    }
}
