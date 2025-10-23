package Structural

import Behavioural_Design_Pattern.Template_Design_Pattern.Good_Code.Concrete_Beverages.Coffee;

-Design-Patterns.Decorator Design Pattern.Good_Code.Concrete_Decorator.ConcreteDecorators;

public class VanillaDecorator implements CoffeeDecorator {
    public VanillaDecorator(Coffee coffee)
    {
        super(coffee);
    }
    @Override
    public String getDesciption(){
    return coffee.getDesciption();
    }
    @Override
    public double getCost()
    {
        return coffee.getCost();
    }
}
