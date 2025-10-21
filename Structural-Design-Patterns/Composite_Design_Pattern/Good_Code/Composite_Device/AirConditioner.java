package Structural-Design-Patterns.Composite_Design_Pattern.Good_Code.Composite_Device;

public class AirConditioner implements SmartComponent {
    @Override
    public void turnOn()
    {
        System.out.println("Air Conditioner is turning on");
    }
    public void turnOff()
    {
        System.out.println("Air Conditioner is turning off");
    }
}
