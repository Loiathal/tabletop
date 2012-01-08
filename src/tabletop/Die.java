package tabletop;

//die class written by Bryan that can be used for spells, weapons, etc.

import java.util.Random;
public class Die {
    static Random dieRoll;
    public static int rollDie(int type, int times) {
        if (dieRoll == null){
            dieRoll = new Random();
        }
        int total = 0;
        while (times > 0) {
            int die;
            die = 1 + dieRoll.nextInt(type);
            total = total + die;
            times--;
        }
        return total;
    }
}