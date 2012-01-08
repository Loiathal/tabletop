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
    
    private String name;
    private Modifier attackBonus;
    private String attackType;          // "Melee Attack" or "Ranged Attack"
    private String applyingStat;        //Str, Dex, etc.
    List<Modifier> damage = new ArrayList<>();
    
    public Attack(String name, Modifier attackBonus, String attackType, String applyingStat, List damageList)
    {
        this.name = name;
        this.attackBonus = attackBonus;
        this.attackType = attackType;
        this.applyingStat = applyingStat;
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
    
    public String getAttackType()
    {
        return attackType;
    }
    
    public String getapplyingStat()
    {
        return applyingStat;
    }
    
    public List getAttackDamage()
    {
        return damage;
    }
    
    
    public void printAttack()
    {
        System.out.println("Attack name: " + name);
        System.out.println("Attack Bonus: " + attackBonus.getValue());
        System.out.println("Damage: ");
        Iterator attackIterator = damage.iterator();
        while (attackIterator.hasNext())
        {
            Modifier modifierObject=(Modifier)attackIterator.next();
            modifierObject.printModifier();
        }   
    }
    
}
