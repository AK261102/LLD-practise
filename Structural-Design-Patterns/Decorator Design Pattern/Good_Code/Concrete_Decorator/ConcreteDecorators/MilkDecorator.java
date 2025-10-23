package Structural

import Behavioural_Design_Pattern.Template_Design_Pattern.Good_Code.Concrete_Beverages.Coffee;

-Design-Patterns.Decorator Design Pattern.Good_Code.Concrete_Decorator.ConcreteDecorators;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public String getDescription()
    {
        return coffee.getDescription();
    }

    @Override
    public double getCost()
    {
        return coffee.getCost();
    }
}
