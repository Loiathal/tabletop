package tabletop;

/**
 * simple spell class written by Bryan Burke to test the die class.
 */
public class Spell {
    public static int castSpell(int dieType, int castLevel){
        return Die.rollDie(dieType, castLevel);
    }
}