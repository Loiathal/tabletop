package tabletop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
    private int characterWeight;
    private int movespeed;
    private String notes;
    private List languages;
    private List skills;
    private String status;
    private List special;
    
    // things Byran isn't sure how to code: skills*, feats*
    // should weapon proficencies be considered part of feats?
    //*started but needs more work or double check
    
    public CoreCharacter()
    {
        //empty Constructor
    }
    
    public void setCharacterName(String Name){
        name = Name;
    }

    public String getCharacterName(){
            return name;
    }
    
    public void setCharacterRace(String Race){
        race = Race;
    }
    
    public String getCharacterRace(){
        return race;
    }
    
    public void setClasslvl(String Classlvl){
        classlvl = Classlvl;
    }
    
    public String getClasslvl(){
        return classlvl;
    }
    
    public void setEffectiveCharacterLevel(int effectiveCharacterLvl){
        ECL = effectiveCharacterLvl;
    }

    public int getEffectiveCharacterLevel(){
        return ECL;
    }
    
    public void setSizeCategory(String Size){
        size = Size;
    }

    public String getSizeCategory (){
        return size;
    }
    
    public void setRange(int Range){
        reach = Range;
    }
    
    public int getRange (){
        return reach;
    }
    
    public void setFavoriteClass(String favoriteClass){
        favoredClass = favoriteClass;
    }
    
    public String getFavoriteClass (){
        return favoredClass;
    }
    
    public void setAbilityScore(String scoreName, int scoreValue){
        switch (scoreName){
            case "_str":
                _str = scoreValue;
                break;
            case "_dex":
                _dex = scoreValue;
                break;
            case "_con":
                _con = scoreValue;
                break;
            case "_int":
                _int = scoreValue;
                break;
            case "_wis":
                _wis = scoreValue;
                break;
            case "_cha":
                _cha = scoreValue;
            default:
                System.out.println("Not a Valid Option");
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
    
    public void setBaseHealth(int health){
        HP = health;
    }
    
    public int getBaseHealth(){
        return HP;
    }
    
    public void setSavingThrow(String saveName, int saveValue){
        switch (saveName) {
            case "fortsave":
                fortsave = saveValue;
                break;
            case "refsave":
                refsave = saveValue;
                break;
            case "willsave":
                willsave = saveValue;
                break;
            default:
                System.out.println("Not a Valid Option");
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
    
    public void setBaseAttackBonus(int baseAttack){
        BAB = baseAttack;
    }
    
    public int getBaseAttackBonus(){
        return BAB;
    }
    
    public void setWeight(int weight){
        characterWeight = weight;
    }

    public int getWeight(){
        return characterWeight;
    }
    
    public void setSpeed(int speed){
        movespeed = speed;
    }
    
    public int getSpeed(){
        return movespeed;
    }
    
    public void setNotes(String Notes){
        notes = Notes;
    }
    
    public String getCharacterNotes (){
        return notes;
    }
    
    public void addLanguage(String newLanguage){
        languages.add(newLanguage);
    }
    
    public void removeLanguage(String lostLanguage){
        languages.remove(lostLanguage);
    }
    
    public void setStatus(String currentStatus){
        status = currentStatus;
    }
    
    public String getCurrentStatus(){
        return status;
    }
    
    public void addSpecial(String newSpecial){
        special.add(newSpecial);
    }
    
    public void removeSpecial(String lostSpecial){
        special.remove(lostSpecial);
    }
    
    public List getSkills()
    {
        return skills;
    }
    
    public void addNewSkill(String name, int ranks, String abilityMod, int armorCheck, int classSkill)
    {
        Skill newSkill = new Skill(name, ranks, abilityMod, armorCheck, classSkill);
        skills.add(newSkill);
    }
    
    public void addSkillPoints(String name, int ranks)
    {
        
    }
    
    public void dump(String field){
        switch (field){
            case "name":
                System.out.println(field + ": " + name);
                break;
            case "race":
                System.out.println(field + ": " + race);
                break;
            case "classlvl":
                System.out.println(field + ": " + classlvl);
                break;
            case "ECL":
                System.out.println(field + ": " + ECL);
                break;
            case "size":
                System.out.println(field + ": " + size);
                break;
            case "reach":
                System.out.println(field + ": " + reach);
                break;
            case "favoredClass":
                System.out.println(field + ": " + favoredClass);
                break;
            case "_str":
                System.out.println(field + ": " + _str);
                break;
            case "_dex":
                System.out.println(field + ": " + _dex);
                break;
            case "_con":
                System.out.println(field + ": " + _con);
                break;
            case "_int":
                System.out.println(field + ": " + _int);
                break;
            case "_wis":
                System.out.println(field + ": " + _wis);
                break;
            case "_cha":
                System.out.println(field + ": " + _cha);
                break;
            case "HP":
                System.out.println(field + ": " + HP);
                break;
            case "fortsave":
                System.out.println(field + ": " + fortsave);
                break;
            case "refsave":
                System.out.println(field + ": " + refsave);
                break;
            case "willsave":
                System.out.println(field + ": " + willsave);
                break;
            case "BAB":
                System.out.println(field + ": " + BAB);
                break;
            case "characterWeight":
                System.out.println(field + ": " + characterWeight);
                break;
            case "movespeed":
                System.out.println(field + ": " + movespeed);
                break;
            case "notes":
                System.out.println(field + ": " + notes);
                break;
            case "languages":
                System.out.println(field + ": " + languages);
                break;
            case "status":
                System.out.println(field + ": " + status);
                break;
            case "special":
                System.out.println(field + ": " + special);
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }
}