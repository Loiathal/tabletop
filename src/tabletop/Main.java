
package tabletop;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Feat Feat1 = new Feat("Power Attack", "RAWR", 1, "PHB");
        Feat1.printFeat();
        
        int i = sc.nextInt();
    }
}
