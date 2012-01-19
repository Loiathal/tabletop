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

public class CommandListModifierRemove extends CommandAbstract{
    
    private Modifier modifier;
    private CommandReceiver myReceiver;
    
    public CommandListModifierRemove(Modifier modifier, CommandReceiver receiver)
    {
        this.modifier = modifier;
        this.myReceiver = receiver;
    }
    
    @Override
    public void execute()
    {
        myReceiver.listModifierRemove(modifier);
    }
    
}
