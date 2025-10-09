package Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Concrete_Commands;

import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Core_Classes.TV;
import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Command;

public class ChangeChannelCommand implements Command {

    int original_channel;
    this.tv=tv;

    public ChangeChannelCommand()
    {
        this.tv=tv;
        this.original_channel=original_channel;
    }

    @Override
    public void execute()
    {
        tv.changeChannel(original_channel);
    }
}
