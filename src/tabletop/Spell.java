package tabletop;
/**
 * simple spell class written by Bryan Burke to test the die class.
 * very simplified class.  goal is only to print a spell block
 */
public class Spell {
    private String name, type, school, subSchool, level, components, castingTime, range, target, duration, save;
    //level needs to have an int for DC calculation
    //range and duration need ints for calculation
    private boolean resistance, attackRoll;
    
    public Spell (String title, String source, String mainSchool, String minorSchool, String lvl, String castReqs, String castTime, String distance, String effect, String time, String savingThrow, boolean spellResistance, boolean attack)
    {
        name = title;
        type = source;
        school = mainSchool;
        subSchool = minorSchool;
        level = lvl;
        components = castReqs;
        castingTime = castTime;
        range = distance;
        target = effect;
        duration = time;
        save = savingThrow;
        resistance = spellResistance;
        attackRoll = attack;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getSchool(){
        return school;
    }
    public String getSubSchool(){
        return subSchool;
    }
    public String getLevel(){
        return level;
    }
    public String getComponents(){
        return components;
    }
    public String getCastingTime(){
        return castingTime;
    }
    public String getRange(){
        return range;
    }
    public String getTarget(){
        return target;
    }
    public String getDuration(){
        return duration;
    }
    public String getSave(){
        return save;
    }
    public boolean getResistance(){
        return resistance;
    }
    public boolean getAttackRoll(){
        return attackRoll;
    }
    public void printSpell(){
        System.out.println("Spell Name: " + name);
        System.out.println("Classification: " + type);
        System.out.println("Main School: " + school);
        System.out.println("SubSchool: " + subSchool);
        System.out.println("Spell Level: " + level);
        System.out.println("Spell Components: " + components);
        System.out.println("Casting Time: " + castingTime);
        System.out.print("Range: ");
            switch (range){
                case "Touch":
                    System.out.println("Creature Touched");
                    break;
                case "Close":
                    System.out.println("25 ft. + 5 ft./2 levels");
                    break;
                case "Medium":
                    System.out.println("100 ft. + 10 ft./level");
                    break;
                case "Long":
                    System.out.println("400 ft. + 40 ft./level");
                    break;
                default:
                    System.out.println(range);
            }
        System.out.println("Target or Effect: " + target);
        System.out.println("Duration: " + duration);
        System.out.println("Saving Throw: " + save);
        System.out.print("Spell Resistance: ");
            if (resistance == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        System.out.print("Attack Roll Necessary: ");
            if (attackRoll == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        System.out.println();
    }
    public static int castSpell(int dieType, int timesRolled){
        return Die.rollDie(dieType, timesRolled);

    }
}