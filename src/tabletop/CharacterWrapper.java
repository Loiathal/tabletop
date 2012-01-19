/*
 * Zachary McAnally, Austin Hanlin
 * 
 * This class wraps around the core character, applying modifiers to scores from other abilities and equipment.
 */

package tabletop;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CharacterWrapper {
    private CoreCharacter character;
    List<Modifier> modifierList = new ArrayList<>();
    List<Attack> attackList = new ArrayList<>();
    
    
    public CharacterWrapper(CoreCharacter character)
    {
        this.character = character;
    }
    
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
    
    public int getBaseAbilityScore(String abilityScore){
        switch(abilityScore)
        {
            case "_str":
                return character.getAbilityScore("_str");
            case "_dex":
                return character.getAbilityScore("_dex");
            case "_con":
                return character.getAbilityScore("_con");
            case "_int":
                return character.getAbilityScore("_int");
            case "_wis":
                return character.getAbilityScore("_wis");
            case "_cha":
                return character.getAbilityScore("_cha");
            default:
                return -1;
        }
    }
    
    public int getModifiedAbilityScore(String abilityScore)
    {
        Iterator modifierIterator = modifierList.iterator();
        
        //do some work
  
        return 0;
    }
    
    public int getModifiedAbilityModifier(String abilityScore)
    {
        
        return 0;
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
                break;
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
    
    public void addLanguage(String newLanguage){
        character.addLanguage(newLanguage);
    }
    
    public void removeLanguage(String lostLanguage){
        character.removeLanguage(lostLanguage);
    }
    
    public void setStatus(String currentStatus){
        character.setStatus(currentStatus);
    }
    
    public String getCharacterStatus(){
        return character.getCharacterNotes();
    }
    
    public void addSpecial(String newSpecial){
        character.addSpecial(newSpecial);
    }
    
    public void removeSpecial(String lostSpecial){
        character.removeSpecial(lostSpecial);
    }
    
    public List getModifierList()
    {
        return modifierList;
    }
    
    public List getAttackList()
    {
        return attackList;
    }
    
    public void addAttack(Attack newAttack)
    {
        attackList.add(newAttack);
    }
    
    public void removeAttack(Attack attackName)
    {
        attackList.remove(attackName);
    }
    
    public void addModifier(Modifier newModifier)
    {
        modifierList.add(newModifier);
    }
    
    public void removeModifier(Modifier modifierName)
    {
        modifierList.remove(modifierName);
    }
    
    public int getBAB()
    {
        return character.getBaseAttackBonus();
    }
    
    public void setBAB(int baseAttack)
    {
        character.setBaseAttackBonus(baseAttack);
    }
    
}