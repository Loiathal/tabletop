/*
 * Zachary McAnally, Austin Hanlin
 * 
 * This class wraps around the core character, applying modifiers to scores from other abilities and equipment.
 */

package tabletop;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.PriorityQueue;

public class CharacterWrapper {
    private CoreCharacter character;
    private int weightLoad;                 //Current weight of equipment/items
    private int maxHP;
    private int currentHP;
    List<Attack> attackList = new ArrayList<>();
    List<Skill> skillList = new ArrayList<>();
    private EquipmentList equipment;
    List<Item> itemList = new ArrayList<>();   
    private ModifierList modifierList;
    
    
    public CharacterWrapper(CoreCharacter character)
    {
        this.character = character;
        this.weightLoad = 0;
        this.maxHP = 0;
        this.currentHP = 0;
        this.modifierList = new ModifierList();
        this.equipment = new EquipmentList();
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
    
    public int getBaseAbilityModifier(String abilityScore)
    {
        switch(abilityScore)
        {
            case "_str":
                return (int)Math.floor((character.getAbilityScore("_str") - 10) / 2);
            case "_dex":
                return (int)Math.floor((character.getAbilityScore("_dex") - 10) / 2);
            case "_con":
                return (int)Math.floor((character.getAbilityScore("_con") - 10) / 2);
            case "_int":
                return (int)Math.floor((character.getAbilityScore("_int") - 10) / 2);
            case "_wis":
                return (int)Math.floor((character.getAbilityScore("_wis") - 10) / 2);
            case "_cha":
                return (int)Math.floor((character.getAbilityScore("_cha") - 10) / 2);
            default:
                return -1;
        }
    }
    
    public int getModifiedAbilityScore(String abilityScore)
    {
        int totalAbilityScore = getBaseAbilityScore(abilityScore);
        for (int i = 0; i < modifierList.size(); i++)
        {
            //Check to see if the modifier is active or not.
            Modifier currentModifier = modifierList.get(i);
                //See if it applies to the current ability score. If so, 
                //add it to the total.
                if (currentModifier.getAppliesTo().equals(abilityScore))
                {
                    totalAbilityScore += currentModifier.getValue();
                }
        }
        return totalAbilityScore;
    }
    
    public int getModifiedAbilityModifier(String abilityScore)
    {
        switch(abilityScore)
        {
            case "_str":
                return (int)Math.floor((getModifiedAbilityScore("_str") - 10) / 2);
            case "_dex":
                return (int)Math.floor((getModifiedAbilityScore("_dex") - 10) / 2);
            case "_con":
                return (int)Math.floor((getModifiedAbilityScore("_con") - 10) / 2);
            case "_int":
                return (int)Math.floor((getModifiedAbilityScore("_int") - 10) / 2);
            case "_wis":
                return (int)Math.floor((getModifiedAbilityScore("_wis") - 10) / 2);
            case "_cha":
                return (int)Math.floor((getModifiedAbilityScore("_cha") - 10) / 2);
            default:
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
    
    public int getMaxHP()
    {
        int maxHP = character.getBaseHealth();
        maxHP += getModifiedAbilityModifier("_con") * character.getClassLevelTotal();
        for (int i = 0; i < modifierList.size(); i++)
        {
            Modifier currentModifier = modifierList.get(i);
            if (currentModifier.getAppliesTo().equals("Health"))
            {
                maxHP += currentModifier.getValue();
            }
        }
        return maxHP;
    }
    
    public int getCurrentHP()
    {
        return currentHP;
    }
    
    public void setCurrentHP(int HP)
    {
        currentHP = HP;
    }
    
    public ModifierList getModifierList()
    {
        return modifierList;
    }
    
    public List getAttackList()
    {
        return attackList;
    }
    
    public List getSkillList()
    {
        return skillList;
    }
    
    public Equipment getEquipSlot(int slot)
    {
        return equipment.getEquip(slot);
    }
    
    public List getEquipList()
    {
        return equipment.getEquipList();
    }
    
    //Here write methods to add/remove equipment. Those methods need to also handle
    //Modifier allocation.
    
    //This method equips the item to the appropriate slot (or unslotted list, if applicable).
    //Assumes that the slot is already empty, and that the item in question is in
    //the character's itemList.
    public void equip(Equipment item)
    {
        //Verify that the item is owned.
        if (!itemList.contains(item))
        {
            System.out.println("No such item is currentl owned.");
        }
        else
        {
            equipment.setEquip(item);
            List equipmentModifiers = item.getItemModifierList();
            for (int i = 0; i < equipmentModifiers.size(); i++)
            {
                Modifier currentModifier = (Modifier)equipmentModifiers.get(i);
                modifierList.addModifier(currentModifier);
            }
            itemList.remove(item);
        }
    }

    public void remove(Equipment item)
    {
        equipment.removeEquip(item);
        
        List equipmentModifiers = item.getItemModifierList();
        for (int i = 0; i < equipmentModifiers.size(); i++)
        {
            Modifier currentModifier = (Modifier)equipmentModifiers.get(i);
            modifierList.removeModifier(currentModifier);
        }
        itemList.add(item);
    }
        
    public void addSkill(Skill newSkill)
    {
        skillList.add(newSkill);
    }
    
    public void removeSkill(Skill skillName)
    {
        skillList.remove(skillName);
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
        modifierList.addModifier(newModifier);
    }
    
    public void removeModifier(Modifier modifierName)
    {
        modifierList.removeModifier(modifierName);
    }
    
    public void addItem(Item newItem)
    {
        itemList.add(newItem);
        weightLoad += newItem.getItemWeight();
    }
    
    public void removeItem(Item item)
    {
        itemList.remove(item);
        weightLoad -= item.getItemWeight();
    }
    
    public int getBAB()
    {
        return character.getBaseAttackBonus();
    }
    
    public void setBAB(int baseAttack)
    {
        character.setBaseAttackBonus(baseAttack);
    }
    
    //This is the all-important method which must be called whenever a piece of
    //equipment is removed or added, or when a spell is cast or ends.
    //Correctly sets modifiers to active or not active depending on whether
    //they stack and such. Still under construction.
    public void clean()
    {
        
    }
    
}