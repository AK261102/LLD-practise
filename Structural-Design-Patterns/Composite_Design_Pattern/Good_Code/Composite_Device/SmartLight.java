package Structural-Design-Patterns.Composite_Design_Pattern.Good_Code.Composite_Device;

public class SmartLight implements SmartComponent {
    @Override
    public void turnOn()
    {
        System.out.println("Smart Light is turning ON");
    }
    @Override
    public void turnOff()
    {
        System.out.println("Smart Light is turning OFF");
    }
}
