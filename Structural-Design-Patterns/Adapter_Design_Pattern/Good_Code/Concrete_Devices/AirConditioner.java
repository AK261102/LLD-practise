package Structural-Design-Patterns.Adapter_Design_Pattern.Good_Code.Concrete_Devices;

public class AirConditioner {
    public void ConnectWithBlueTooth()
    {
        System.out.println("Connect with BlueTooth");
    }
    public void startCooling()
    {
        System.out.println("Starting with cooling");
    }
    public void stopCooling()
    {
        System.out.println("Stopping with cooling");
    }
    public void StopWithBlueTooth()
    {
        System.out.println("Stop with BlueTooth");
    }
}
