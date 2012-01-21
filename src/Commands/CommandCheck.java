/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Commands;

/**
 *
 * @author zmcanally
 */
public class CommandCheck extends CommandAbstract{
    
    private String check;
    private int modifier;
    private CommandReceiver myReceiver;
    
    public CommandCheck(String check, int modifier, CommandReceiver receiver)
    {
        this.check = check;
        this.modifier = modifier;
        this.myReceiver = receiver;
    }
    
    @Override
    public void execute()
    {
        myReceiver.Check(check, modifier);
    }
    
    
            
    
    
    
}
