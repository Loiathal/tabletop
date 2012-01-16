/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Commands;

/**
 *
 * @author zmcanally
 */

import tabletop.Attack;

public class CommandListAttackRemove extends CommandAbstract{
    
    private Attack attack;
    private CommandReceiver myReceiver;
    
    public CommandListAttackRemove(Attack attack, CommandReceiver receiver)
    {
        this.attack = attack;
        this.myReceiver = receiver;
    }
    
    @Override
    public void execute()
    {
        myReceiver.listAttackRemove(attack);
    }
    
}
