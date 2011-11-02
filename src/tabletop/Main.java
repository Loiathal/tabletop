
package tabletop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
   /*     
        Feat Feat1 = new Feat("Power Attack", "RAWR", 1, "PHB");
        Feat1.printFeat();
        
        System.out.println("");
        
        Skill Skill1 = new Skill("Jump", 15, "Strength", "yes", "class-skill");
        Skill1.printSkill();
     */   
        ArrayList kitModifiers = new ArrayList();
        Modifier Modifier1 = new Modifier(2, "Open Lock", "Untyped");
        Modifier Modifier2 = new Modifier(4, "Attack", "Morale");
        kitModifiers.add(Modifier1);
        kitModifiers.add(Modifier2);
        
        Item masterworkThievesKit = new Item("Tool", "Thieves Kit", kitModifiers, 5, "Helps you open shit.");
        System.out.println("PRINT");
        masterworkThievesKit.printItem();
    }
}
