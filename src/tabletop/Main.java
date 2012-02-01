package tabletop;

import java.util.ArrayList;
import Commands.CommandReceiver;

class Main {
    
    public static void main(String[] args) {
        
        //First, create the character itself.
        CoreCharacter coreCharacter = new CoreCharacter();
        CharacterWrapper characterWrapper = new CharacterWrapper(coreCharacter);
        CommandReceiver character = new CommandReceiver(characterWrapper);
        
        //Next, we set its base stats and BAB, which we'll use for this example.
        setBaseStats(character);
        
        //Test our ability to perform an ability score check with applicable 
        //modifiers included.
        AbilityCheckTest(character);
        
        AttackTest(character);
        
        Thor(character);

    }
    
    
    
    
    public static void setBaseStats(CommandReceiver character)
    {
        System.out.println("Setting Strength score to 14.");
        character.FieldSet("_str", 14);
        System.out.println("Setting Dexterity score to 10.");
        character.FieldSet("_dex", 10);
        System.out.println("Setting Constitution score to 10.");
        character.FieldSet("_con", 10);
        System.out.println("Setting Intelligence score to 10.");
        character.FieldSet("_int", 10);
        System.out.println("Setting Wisdom score to 10.");
        character.FieldSet("_wis", 10);   
        System.out.println("Setting Charisma score to 10.");
        character.FieldSet("_cha", 10);     
        System.out.println("Setting Base Attack Bonus to +4.");
        character.FieldSet("BAB", 4);
        System.out.println();
        System.out.println();
    }
    
    public static void AttackTest(CommandReceiver character)
    {
        //Create a new attack: A longsword
        DynamicModifier longswordDamage = new DynamicModifier(1, 8, "Damage", "Longsword");
        ArrayList longswordDamageList = new ArrayList();
        longswordDamageList.add(longswordDamage);
        
        //This attack is named Longsword, has a constant attack bonus of 0, is
        //a melee attack, uses strength as its modifying stat, is a one handed
        //attack, and deals 1d8 damage(as setup in longswordDamagelist).
        Attack longsword = new Attack("Longsword", 0, Attack.MELEE, "_str", Attack.ONE_HANDED, longswordDamageList);
        character.listAttackAdd(longsword);
        
        //Perform the attack.
        character.Attack("Longsword", 0, 0);
        System.out.println();
        System.out.println();
        
        
        //Now let's add some modifiers to test attack further.
        System.out.println("Let's make things a bit more interesting. Let's"
                + "increase the BAB to 6, giving our fighter two attacks on a "
                + "full attack. We'll add another attack to our list of ");
        System.out.println("attacks"
        + ", and roll both, as well as add some more bonus to him ("
        + "including replacing his weapon with a +1 flaming greatsword).");
        character.listAttackRemove(longsword);
        
        character.FieldSet("BAB", 6);
        
        //Create damage values.
        DynamicModifier greatswordDamage = new DynamicModifier(2, 6, "Damage", "Greatsword");
        StaticModifier plusOne = new StaticModifier(1, "Damage", "+1");
        DynamicModifier flamingGreatsword = new DynamicModifier(1, 8, "Damage" , "Flaming Weapon");
        ArrayList greatswordDamageList = new ArrayList();
        greatswordDamageList.add(greatswordDamage);
        greatswordDamageList.add(plusOne);
        greatswordDamageList.add(flamingGreatsword);
        
        Attack greatsword = new Attack("Greatsword", 1, Attack.MELEE, "_str", Attack.TWO_HANDED, greatswordDamageList);
        //This attack is at -4 because it is his second attack in the round.
        Attack greatsword2 = new Attack("Greatsword 2", -4, Attack.MELEE, "_str", Attack.TWO_HANDED, greatswordDamageList);
        character.listAttackAdd(greatsword);
        character.listAttackAdd(greatsword2);
        
        //Now give him some other bonuses. We'll just say his cleric cast bless
        //on him, and he has Weapon Focus(greatsword). Each give him a +1 to attack.
        StaticModifier Bless = new StaticModifier(1, "Melee Attack", "Bless");
        character.listModifierAdd(Bless);
        StaticModifier WeaponFocus = new StaticModifier(1, "Greatsword Attack", "Weapon Focus");
        character.listModifierAdd(WeaponFocus);
        
        //The misc. +2 here is for flanking, we'll say.
        character.Attack("Full", 2, 0);
    }
    
    public static void AbilityCheckTest(CommandReceiver character)
    {        
        System.out.println("Roll an Strength check, after an item which adds 2 to "
                + "strength checks has been activated.");
        StaticModifier strengthCheckBonus = new StaticModifier(2, "str Check", "Brute Gauntlets");
        character.listModifierAdd(strengthCheckBonus);
        character.Check("str", 0);
        System.out.println();
        System.out.println();
    }
    
    public static void Thor(CommandReceiver character)
    {
        System.out.println("Now let's really have some fun. We'll make Thor's "
                + "hammer, statted in Deities and Demigods to be a ");
        System.out.println("+5 chaotic distance ghost touch holy mighty cleaving "
                + "returning thundering warhammer.");
        System.out.println("Also note that we'll have to grant our warrior a "
                + "strength score of 92, just so he can lift the godly weapon.");
        
        character.FieldSet("_str", 92);
        
        StaticModifier plusFive = new StaticModifier(5, "Damage", "+5");
        DynamicModifier chaotic = new DynamicModifier(2, 6, "Damage", "Chaotic");
        DynamicModifier warhammerDamage = new DynamicModifier(6, 6, "Damage", "Thor's Hammer");
        DynamicModifier thundering = new DynamicModifier(1, 8, "Damage", "Thundering");
        DynamicModifier holy = new DynamicModifier(2, 6, "Damage", "Holy");
        
        ArrayList ThorsHammerDamageList = new ArrayList();
        ThorsHammerDamageList.add(plusFive);
        ThorsHammerDamageList.add(chaotic);
        ThorsHammerDamageList.add(warhammerDamage);
        ThorsHammerDamageList.add(thundering);
        ThorsHammerDamageList.add(holy);
        
        Attack ThorsHammer = new Attack("Thor's Hammer", 5, Attack.MELEE, "_str", Attack.ONE_HANDED, ThorsHammerDamageList);
        character.listAttackAdd(ThorsHammer);
        
        character.Attack("Thor's Hammer", 0, 0);

        System.out.println("Note that while the bonus to haste stayed, but the "
                + "bonus from weapon focus did not. This is");
        System.out.println("because weapon focus is specific to a given weapon"
                + "(in this case, greatswords), so it did not apply.");
        System.out.println();
        
        System.out.println("Also, because this is a returning and distance hammer,"
                + "we could create ranged attacks for it if we so chose.");
        
    }
        
}