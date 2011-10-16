
package tabletop;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Feat Feat1 = new Feat("Power Attack", "RAWR", 1, "PHB");
        Feat1.printFeat();
        
        System.out.println("");
        
        skills skills1 = new skills("Jump", 15, "Strength", "yes", "class-skill");
        skills1.printSkills();
        
    }
}
