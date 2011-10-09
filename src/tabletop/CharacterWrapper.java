/*
 * Zachary McAnally
 * 
 * This class wraps around the core character, applying modifiers to scores from other abilities and equipment.
 */


package tabletop;

public class CharacterWrapper {
    private CoreCharacter character;
    
    public int modifiedAbilityScore(String abilityScore)
    {
        switch (abilityScore)
        {
            case "str": 
                return character.getAbilityScore("str");
            case "dex":
                return character.getAbilityScore("dex");
            case "con":
                return character.getAbilityScore("con");
            case "int":
                return character.getAbilityScore("int");
            case "wis":
                return character.getAbilityScore("wis");
            case "cha":
                return character.getAbilityScore("cha");
            default:
                return -1;
        }
    }
    
}
