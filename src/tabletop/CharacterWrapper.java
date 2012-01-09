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
    
    
    public void setCharacterName(String Name){
        character.setCharacterName(Name);
    }
    
    public void setCharacterRace(String Race){
        character.setCharacterRace(Race);
    }
    
    public void setClasslvl(String Classlvl){
        character.setClasslvl(Classlvl);
    }
    
    public void setEffectiveCharacterLevel(int effectiveCharacterLvl){
        character.setEffectiveCharacterLevel(effectiveCharacterLvl);
    }
    
    public void setSizeCategory(String Size){
        character.setSizeCategory(Size);
    }
    
    public void setRange(int Range){
        character.setRange(Range);
    }
    
    public void setFavoriteClass(String favoriteClass){
        character.setFavoriteClass(favoriteClass);
    }
    
    public void setAbilityScore(String scoreName, int scoreValue){
        character.setAbilityScore(scoreName, scoreValue);
    }
    
    public void setBaseHealth(int health){
        character.setBaseHealth(health);
    }
    
    public void setSavingThrow(String saveName, int saveValue){
        switch (saveName) {
            case "fortsave":
                character.setAbilityScore(saveName, saveValue);
                break;
            case "refsave":
                character.setAbilityScore(saveName, saveValue);
                break;
            case "willsave":
                character.setAbilityScore(saveName, saveValue);
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }
    
    public void setBaseAttackBonus(int baseAttack){
        character.setBaseAttackBonus(baseAttack);
    }
    
    public void setWeight(int pounds){
        character.setWeight(pounds);
    }
    
    public void setSpeed(int speed){
        character.setSpeed(speed);
    }
    
    public void setNotes(String Notes){
        character.setNotes(Notes);
    }
    
    public void setStatus(String currentStatus){
        character.setStatus(currentStatus);
    }
    
    
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
    
    public int getBAB()
    {
        return character.getBaseAttackBonus();
    }
    
    
}