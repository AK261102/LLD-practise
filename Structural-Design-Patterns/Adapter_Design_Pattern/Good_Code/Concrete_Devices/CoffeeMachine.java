package Structural-Design-Patterns.Adapter_Design_Pattern.Good_Code.Concrete_Devices;

public class CoffeeMachine {
    public void StartCoffeeMachine()
    {
        System.out.println("Starting my coffee machine");
    }
    public void StartBrewing()
    {
        System.out.println("Starting with brewing");
    }
    public void StopBrewing()
    {
        System.out.println("Stopping with brewing");
    }
    public void StopCoffeeMachine()
    {
        System.out.println("Stopping my coffee machine");
    }
}
