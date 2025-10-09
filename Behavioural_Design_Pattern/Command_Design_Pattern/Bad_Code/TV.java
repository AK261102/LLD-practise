package Behavioural_Design_Pattern.Command_Design_Pattern.Bad_Code;

public class TV {
    void turnoff()
    {
        System.out.println("turning off");
    }
    void turnon()
    {
System.out.println("turning on");
    }
    void changeChannel(String channel)
    {
System.out.println("changing channel");
    }
    void adjustVolume(int volume)
    {
System.out.println("adjusting volume");
    }
}
