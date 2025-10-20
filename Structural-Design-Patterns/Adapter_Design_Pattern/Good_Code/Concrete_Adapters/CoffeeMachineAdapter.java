package Structural-Design-Patterns.Adapter_Design_Pattern.Good_Code.Concrete_Adapters;

import Structural.*;
public class CoffeeMachineAdapter {
    public CoffeeMachine coffee;
    public CoffeeMachine(CoffeeMachine coffee)
    {
        this.coffee=coffee;
    }
    @Override
    public void turnon()
    {
        coffee.StartCoffeeMachine();
        coffee.StartBrewing();
    }
    @Override void turnoff()
    {
        coffee.StopBrewing();
        coffee.StopCoffeeMachine();
    }
}
