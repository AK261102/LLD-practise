package Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Concrete_Commands;

import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Core_Classes.TV;
import Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Command;

public class AdjustVolumeCommand implements Command {
    private TV tv;
    private int volume;
    public AdjustVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }
    @Override
    public void execute() {
        tv.changeVolume(volume);
    }
}
