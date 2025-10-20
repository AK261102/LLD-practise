package Structural-Design-Patterns.Adapter_Design_Pattern.Good_Code.Concrete_Devices;

public class SmartLight {
    public void ConnectWithWifi()
    {
        System.out.println("Connecting with wifi");
    }
    public void OnSwitch()
    {
        System.out.println("Switching on");
    }
    public void OffSwitch()
    {
        System.out.println("Switching off");
    }
    public void DisconnectWithWifi()
    {
        System.out.println("Disconnecting with wifi");
    }
}
