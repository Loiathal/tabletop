package tabletop;

public class CoreCharacter {
    
    private String name;
    private String race;
    private String classlvl;
    private int ECL;
    private String size;
    private int reach;
    private String favoredClass;
    private int _str;
    private int _dex;
    private int _con;
    private int _wis;
    private int _int;
    private int _cha;
    private int HP;
    private int fortsave;
    private int refsave;
    private int willsave;
    private int BAB;
    private int characterweight;
    private int movespeed;
    private String notes;
    
    // things Byran isn't sure how to code: skills, feats, items, spells, languages, status, companion, special
    // should weapon proficencies be considered part of feats?
    
    public String getCharacterName(String characterName){
        if (characterName.equalsIgnoreCase("name")){
            return name;
        } else {
            return null;
        }
    }
    
    public String getCharacterRace(String characterRace){
        if (characterRace.equalsIgnoreCase("race")){
            return race;
        } else {
            return null;
        }
    }
    
    public String getclasses(String classes){
        if (classes.equalsIgnoreCase("class") || classes.equalsIgnoreCase("classlevel") || classes.equalsIgnoreCase("classlvl")){
            return classlvl;
        } else {
            return null;
        }
    }

    public int getEffectiveCharacterLevel(String effectiveCharacterLevel){
        if (effectiveCharacterLevel.equalsIgnoreCase("ecl") || effectiveCharacterLevel.equalsIgnoreCase("effectivecharacterlevel") || effectiveCharacterLevel.equalsIgnoreCase("effectivecharacterlvl")){
            return ECL;
        } else {
            return -1;
        }
    }

    public String getSizeCategory (String sizeCategory){
        if (sizeCategory.equalsIgnoreCase("size") || sizeCategory.equalsIgnoreCase("sizecategory")){
            return size;
        } else {
            return null;
        }
    }
    
    public int getRange (String range){
        if (range.equalsIgnoreCase("reach")){
            return reach;
        } else {
            return -1;
        }
    }
    
    public String getFavoriteClass (String favoriteClass){
        if (favoriteClass.equalsIgnoreCase("favoredclass")){
            return favoredClass;
        } else {
            return null;
        }
    }

    public int getAbilityScore(String abilityScore){
         if (abilityScore.equalsIgnoreCase("str") || abilityScore.equalsIgnoreCase("strength")) {
             return _str;
         } else if (abilityScore.equalsIgnoreCase("dex") || abilityScore.equalsIgnoreCase("dexterity")) {
             return _dex;
         } else if (abilityScore.equalsIgnoreCase("con") || abilityScore.equalsIgnoreCase("constitution")) {
             return _con;
         } else if (abilityScore.equalsIgnoreCase("int") || abilityScore.equalsIgnoreCase("intelligence")) {
             return _int;
         } else if (abilityScore.equalsIgnoreCase("wis") || abilityScore.equalsIgnoreCase("wisdom")) {
             return _wis;
         } else if (abilityScore.equalsIgnoreCase("cha") || abilityScore.equalsIgnoreCase("charisma")) {
             return _cha;
         } else {
             return -1;
         }
    }
    
    public int getBaseHealth(String baseHealth){
        if (baseHealth.equalsIgnoreCase("hp") || baseHealth.equalsIgnoreCase("hitpoints") || baseHealth.equalsIgnoreCase("healthpoints")) {
            return HP;
        } else {
            return -1;
        }
    }
    
    public int getSavingThrow(String savingThrow){
        if (savingThrow.equalsIgnoreCase("fortsave") || savingThrow.equalsIgnoreCase("fortitudeSave")) {
             return fortsave;
         } else if (savingThrow.equalsIgnoreCase("refsave") || savingThrow.equalsIgnoreCase("reflexSave")) {
             return refsave;
         } else if (savingThrow.equalsIgnoreCase("willsave") || savingThrow.equalsIgnoreCase("willsave")) {
             return willsave;
         } else {
             return -1;
         }
    }
    
    public int getBaseAttackBonus(String baseAttackBonus){
        if (baseAttackBonus.equalsIgnoreCase("bab") || baseAttackBonus.equalsIgnoreCase("baseattackbonus")) {
            return BAB;
        } else {
            return -1;
        }
    }

    public int getWeight(String weight){
        if (weight.equalsIgnoreCase("characterweight")) {
            return characterweight;
        } else {
            return -1;
        }
    }
    
    public int getSpeed(String speed){
        if (speed.equalsIgnoreCase("speed") || speed.equalsIgnoreCase("movementspeed") || speed.equalsIgnoreCase("movement")) {
            return movespeed;
        } else {
            return -1;
        }
    }
    
    public String getCharacterNotes (String characterNotes){
        if (characterNotes.equalsIgnoreCase("notes") || characterNotes.equalsIgnoreCase("campaignnotes") || characterNotes.equalsIgnoreCase("characternotes")){
            return notes;
        } else {
            return null;
        }
    }
}
    