package Structural-Design-Patterns.Decorator Design Pattern.Good_Code.Concrete_Coffee_type;

public class Espresso implements Coffee {
    @Override
    public String getDescription()
    {
        return "Espresso";
    }
    @Override
    public double getCost()
    {
        return 3.00;
    }
}
