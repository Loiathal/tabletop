/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Commands;

/**
 *
 * @author zmcanally
 */
public class CommandFieldSetInt extends CommandAbstract {
    
    private String field;
    private int value;
    private CommandReceiver myReceiver;
    
    public CommandFieldSetInt(String field, int value, CommandReceiver receiver)
    {
        this.field = field;
        this.value = value;
        this.myReceiver = receiver;
    }
    
    @Override
    public void execute()
    {
        myReceiver.FieldSet(field, value);
    }
    
}
