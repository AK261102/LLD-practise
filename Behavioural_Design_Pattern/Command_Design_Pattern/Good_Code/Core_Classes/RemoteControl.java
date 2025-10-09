package Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Core_Classes;

import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Command;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;

    public void setOnCommand()
    {
        this.onCommand=onCommand;
    }

    public void setOffCommand()
    {
        this.offCommand=offCommand;
    }

    public void pressOnButtom()
    {
        onCommand.execute();
    }

    public void pressOffButtom()
    {
        offCommand.execute();
    }

}
