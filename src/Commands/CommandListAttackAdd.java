/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author Zachary
 */

import tabletop.Attack;


import java.util.List;


public class CommandListAttackAdd extends CommandAbstract {
    
    private Attack attack;
    private CommandReceiver myReceiver;
    
    
    public CommandListAttackAdd(Attack attack, CommandReceiver receiver)
    {
        this.attack = attack;
        this.myReceiver = receiver;
    }
    
    @Override
    public void execute()
    {
        myReceiver.listAttackAdd(attack);
    }
    
}
