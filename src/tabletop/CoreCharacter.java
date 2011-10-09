package tabletop;

public class CoreCharacter {
    
    String name;
    String race;
    String classlvl;
    int ECL;
    String size;
    int reach;
    String favoredclass;
    private int Str;
    private int Dex;
    private int Con;
    private int Wis;
    private int Int;
    private int Cha;
    int HP;
    int fortsave;
    int refsave;
    int willsave;
    int BAB;
    int regAC;
    int flatAC;
    int touchAC;
    int flattouchAC;
    int charweight;
    int itemweight;
    int totalweight;
    int movespeed;
    String notes;
    
    // things Byran isn't sure how to code: skills, feats, items, spells, languages, status, companion, special
    // should weapon proficencies be considered part of feats?
    
    void getname(){
        
    }
    void setname(){
        
    }
    void getrace(){
        
    }
    void setrace(){
        
    }
    void getclasslvl(){
        
    }
    void setclasslvl(){
        
    }
    void getECL(){
        
    }
    void setECL(){
        
    }
    void getsize(){
        
    }
    void setsize(){
        
    }
    void getreach(){
        
    }
    void setreach(){
        
    }
    void getfavoredclass(){
        
    }
    void setfavoredclass(){
        
    }
    
    public int getAbilityScore(String abilityScore){
         if (abilityScore.equalsIgnoreCase("str") || abilityScore.equalsIgnoreCase("strength")) {
             return Str;
         } else if (abilityScore.equalsIgnoreCase("dex") || abilityScore.equalsIgnoreCase("dexterity")) {
             return Dex;
         } else if (abilityScore.equalsIgnoreCase("con") || abilityScore.equalsIgnoreCase("constitution")) {
             return Con;
         } else if (abilityScore.equalsIgnoreCase("int") || abilityScore.equalsIgnoreCase("intelligence")) {
             return Int;
         } else if (abilityScore.equalsIgnoreCase("wis") || abilityScore.equalsIgnoreCase("wisdom")) {
             return Wis;
         } else if (abilityScore.equalsIgnoreCase("cha") || abilityScore.equalsIgnoreCase("charisma")) {
             return Cha;
         } else {
             return -1;
         }
    }
    
    void getHP(){
        
    }
    void setHP(){
        
    }
    
    public int getSavingThrow(String savingThrow){
        
    }
    void getfortsave(){
        
    }
    void setfortsave(){
        
    }
    void getrefsave(){
        
    }
    void setrefsave(){
        
    }
    void getwillsave(){
 
    }
    void setwillsave(){
        
    }
    void getBAB(){
        
    }
    void setBAB(){
        
    }
    void getAC(){
        
    }
    void setAC(){
        
    }
    void getflatAC(){
        
    }
    void setflatAC(){
        
    }
    void gettouchAC(){
        
    }
    void settouchAC(){
        
    }
    void getflattouchAC(){
        
    }
    void setflattouchAC(){
        
    }
    void getcharweight(){
        
    }
    void setcharweight(){
        
    }
    void getitemweight(){
        
    }
    void setitemweight(){
        
    }
    void gettotalweight(){
        
    }
    void settotalweight(){
        
    }
    void getmovespeed(){
        
    }
    void setmovespeed(){
        
    }
    void getnotes(){
    
    }
    void setnotes(){
        
    }
}
    