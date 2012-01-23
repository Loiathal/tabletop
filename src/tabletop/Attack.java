/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletop;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Zachary
 */
public class Attack {
    
    public static final int OFF_HANDED = 0;
    public static final int ONE_HANDED = 1;
    public static final int TWO_HANDED = 2;
    
    public static final int MELEE = 0;
    public static final int RANGED = 1;
    
    private String name;
    private Modifier attackBonus;
    private int attackType;             // "Melee" or "Ranged"
    private String applyingStat;        //Str, Dex, etc.
    private int handed;                 //Two, One, or Off
    List<Modifier> damage = new ArrayList<>();
    
    //Modifier attackBonus takes the form modifies = "Attack" and 
    //modifierType = "Untyped"
    
    public Attack(String name, Modifier attackBonus, int attackType, 
            String applyingStat, int handed, List damageList)
    {
        this.name = name;
        this.attackBonus = attackBonus;
        this.attackType = attackType;
        this.applyingStat = applyingStat;
        this.handed = handed;
        this.damage = damageList;
    }

    public String getAttackName()
    {
        return name;
    }
    
    public Modifier getAttackBonus()
    {
        return attackBonus;
    }
    
    public int getAttackType()
    {
        return attackType;
    }
    
    public String getApplyingStat()
    {
        return applyingStat;
    }
    
    public List getAttackDamage()
    {
        return damage;
    }
    
    public int getHanded()
    {
        return handed;
    }
    
    public void printAttack()
    {
        System.out.println("Attack name: " + name);
        System.out.println("Attack Bonus: " + attackBonus.getValue());
        System.out.println("Attack Type: " + attackType);
        System.out.println("Applying Stat: " + applyingStat);
        System.out.println("Number of Hands: " + handed);
        System.out.println("Damage: ");
        Iterator attackIterator = damage.iterator();
        while (attackIterator.hasNext())
        {
            Modifier modifierObject=(Modifier)attackIterator.next();
            modifierObject.printModifier();
        }   
    }
    
}
