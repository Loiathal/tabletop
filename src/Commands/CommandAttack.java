/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author Zachary
 */

import tabletop.Modifier;


public class CommandAttack extends CommandAbstract {
    
    private String attackName;
    private int attackModifier;
    private Modifier damageModifier;
    private CommandReceiver myReceiver;
    
    
    public CommandAttack(String attackName, int attackModifier, Modifier damageModifier, 
            CommandReceiver receiver)
    {
        this.myReceiver = receiver;
        this.attackName = attackName;
        this.attackModifier = attackModifier;
        this.damageModifier = damageModifier;
    }
    
    @Override
    public void execute()
    {
        myReceiver.Attack(attackName, attackModifier, damageModifier);
    }
    
}
