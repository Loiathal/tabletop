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
    
    public String getCharacterName(){
        return character.getCharacterName();
    }
    
    public void setCharacterRace(String Race){
        character.setCharacterRace(Race);
    }
    
    public String getCharacterRace(){
        return character.getCharacterRace();
    }
    
    public void setClasslvl(String Classlvl){
        character.setClasslvl(Classlvl);
    }
    
    public String getClasslvl(){
        return character.getClasslvl();
    }
    
    public void setEffectiveCharacterLevel(int effectiveCharacterLvl){
        character.setEffectiveCharacterLevel(effectiveCharacterLvl);
    }
    
    public int getEffectiveCharacterLevel(){
        return character.getEffectiveCharacterLevel();
    }
    
    public void setSizeCategory(String Size){
        character.setSizeCategory(Size);
    }
    
    public String getSizeCategory(){
        return character.getSizeCategory();
    }
    
    public void setRange(int Range){
        character.setRange(Range);
    }
    
    public int getRange(){
        return character.getRange();
    }
    
    public void setFavoriteClass(String favoriteClass){
        character.setFavoriteClass(favoriteClass);
    }
    
    public String getFavoriteClass(){
        return character.getFavoriteClass();
    }
    
    public void setAbilityScore(String scoreName, int scoreValue){
        character.setAbilityScore(scoreName, scoreValue);
    }
    
    public int getAbilityScore(String abilityScore){
         if (abilityScore.equalsIgnoreCase("str") || abilityScore.equalsIgnoreCase("strength")) {
             return character.getAbilityScore(abilityScore);
         } else if (abilityScore.equalsIgnoreCase("dex") || abilityScore.equalsIgnoreCase("dexterity")) {
             return character.getAbilityScore(abilityScore);
         } else if (abilityScore.equalsIgnoreCase("con") || abilityScore.equalsIgnoreCase("constitution")) {
             return character.getAbilityScore(abilityScore);
         } else if (abilityScore.equalsIgnoreCase("int") || abilityScore.equalsIgnoreCase("intelligence")) {
             return character.getAbilityScore(abilityScore);
         } else if (abilityScore.equalsIgnoreCase("wis") || abilityScore.equalsIgnoreCase("wisdom")) {
             return character.getAbilityScore(abilityScore);
         } else if (abilityScore.equalsIgnoreCase("cha") || abilityScore.equalsIgnoreCase("charisma")) {
             return character.getAbilityScore(abilityScore);
         } else {
             return -1;
         }
    }
    
    public void setBaseHealth(int health){
        character.setBaseHealth(health);
    }
    
    public int getBaseHealth(){
        return character.getBaseHealth();
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
    
        public int getSavingThrow(String savingThrow){
        if (savingThrow.equalsIgnoreCase("fortsave") || savingThrow.equalsIgnoreCase("fortitudeSave")) {
             return character.getSavingThrow(savingThrow);
         } else if (savingThrow.equalsIgnoreCase("refsave") || savingThrow.equalsIgnoreCase("reflexSave")) {
             return character.getSavingThrow(savingThrow);
         } else if (savingThrow.equalsIgnoreCase("willsave") || savingThrow.equalsIgnoreCase("willsave")) {
             return character.getSavingThrow(savingThrow);
         } else {
             return -1;
         }
    }
    
    public void setBaseAttackBonus(int baseAttack){
        character.setBaseAttackBonus(baseAttack);
    }
    
    public int getBaseAttackBonus(){
        return character.getBaseAttackBonus();
    }
    
    public void setWeight(int pounds){
        character.setWeight(pounds);
    }
    
    public int getWeight(){
        return character.getWeight();
    }
    
    public void setSpeed(int speed){
        character.setSpeed(speed);
    }
    
    public int getSpeed(){
        return character.getSpeed();
    }
    
    public void setNotes(String Notes){
        character.setNotes(Notes);
    }
    
    public String getCharacterNotes(){
        return character.getCharacterNotes();
    }
    
    public void setStatus(String currentStatus){
        character.setStatus(currentStatus);
    }
    
    public String getCharacterStatus(){
        return character.getCharacterNotes();
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