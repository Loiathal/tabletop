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
    private Modifier attackModifer;
    private CommandReceiver myReceiver;
    
    
    public CommandAttack(String attackName, Modifier attackModifier,
            CommandReceiver receiver)
    {
        this.myReceiver = receiver;
        this.attackName = attackName;
        this.attackModifer = attackModifier;
    }
    
    public void execute()
    {
        myReceiver.Attack(attackName, attackModifer);
    }
    
}
