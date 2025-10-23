package Structural-Design-Patterns.Decorator Design Pattern.Good_Code.Concrete_Coffee_type;

public class Cappuccino implements Coffee {
    @Override
    public String getDescription()
    {
        return "Cappuccino";
    }
    @Override
    public double getCost()
    {
        return 4.00;
    }
}
