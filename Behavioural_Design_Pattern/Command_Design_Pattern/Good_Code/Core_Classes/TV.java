package Behavioural_Design_Pattern.Command_Design_Pattern.Good_Code.Core_Classes;

public class TV {
    public void turingON()
    {
        System.out.println("TV is turing on");
    }
    public void turningOFF()
    {
        System.out.println("TV is turning off");
    }
    public void changeChannel(int channel)
    {
        System.out.println("This Channel is changing:"+channel);
    }
    public void changeVolume(int volume)
    {
        System.out.println("This channel volume increased to:"+volume);
    }
}
