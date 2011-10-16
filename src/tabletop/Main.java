
package tabletop;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Feat Feat1 = new Feat("Power Attack", "RAWR", 1, "PHB");
        Feat1.printFeat();
        
        System.out.println("");
        
        Skill Skill1 = new Skill("Jump", 15, "Strength", "yes", "class-skill");
        Skill1.printSkill();
        
    }
}
