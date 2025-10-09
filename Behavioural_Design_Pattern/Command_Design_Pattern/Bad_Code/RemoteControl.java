package Behavioural_Design_Pattern.Command_Design_Pattern.Bad_Code;

public class RemoteControl {
    Public TV tv;
    public RemoteControl(TV tv)
    {
        this.tv=tv;
    }

    public void presson()
    {
        tv.turnon();
    }
    public void pressoff()
    {
        tv.turnoff();
    }
    public void updownvolume(int volume)
    {
        tv.adjustVolume(volume);
    }
    public void rightleftchannel(String channel)
    {
        tv.changeChannel(channel);
    }

    // now we need to add each method for each type of action

    public void pressOnChangeVolumeChannel(int volume,String channel)
    {
        tv.turnon;
        tv.rightleftchannel("Song Liv");
        tv.volume(30);
    }
}
