package Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Concrete_Commands;

import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Command;
import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Core_Classes.TV;

public class TurnOnCommand implements Command {
    TV tv;
    public TurnOnCommand()
    {
        this.tv=tv;
    }
    @Override
    public void execute()
    {
        tv.turingON();
    }
}
