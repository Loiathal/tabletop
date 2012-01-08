/*
 * Zachary McAnally, Austin Hanlin
 * 
 * This class wraps around the core character, applying modifiers to scores from other abilities and equipment.
 */

package tabletop;

import java.util.List;
import java.util.ArrayList;

public class CharacterWrapper {
    private CoreCharacter character;
    List<Modifier> modifierList = new ArrayList<>();
    List<Attack> attackList = new ArrayList<>();
    
    
    //Still need to make this take modifiers into account.
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
    
    public List getModifierList()
    {
        return modifierList;
    }
    
    public List getAttackList()
    {
        return attackList;
    }
}