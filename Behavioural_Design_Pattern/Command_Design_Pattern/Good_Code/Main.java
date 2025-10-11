package Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code;

import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Concrete_Commands.AdjustVolumeCommand;
import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Concrete_Commands.ChangeChannelCommand;
import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Concrete_Commands.TurnOffCommand;
import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Concrete_Commands.TurnOnCommand;
import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Core_Classes.*;

public class Main {
    public static void main(String[] args) {
        TV tv=new TV();
        Command turnon=new TurnOnCommand();
        Command turnoff=new TurnOffCommand();
        Command changeV=new AdjustVolumeCommand(tv, 5);
        Command changeC=new ChangeChannelCommand(tv,20);
        RemoteControl rc=new RemoteControl();
        rc.pressOnButtom();
        rc.AdjustVolumeCommand(changeV);
        rc.ChangeChannelCommand(changeC);
        rc.pressOffButtom();
        changeV.execute();
        changeC.execute();
        
    }
}
