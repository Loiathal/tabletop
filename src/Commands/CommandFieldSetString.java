/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Commands;

/**
 *
 * @author zmcanally
 */
public class CommandFieldSetString extends CommandAbstract {
    
    private String field;
    private String value;
    private CommandReceiver myReceiver;
    
    public CommandFieldSetString(String field, String value, CommandReceiver receiver)
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
