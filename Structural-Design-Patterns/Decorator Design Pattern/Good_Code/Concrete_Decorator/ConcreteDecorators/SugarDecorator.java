package Structural-Design-Patterns.Decorator Design Pattern.Good_Code.Concrete_Decorator.ConcreteDecorators;

public class SugarDecorator implements CoffeeDecorator {
    public SugarDecorator(Coffee coffee)
    {
        this.coffee=coffee;
    }
    @Override
    public String getDesciption(){
        return coffee.getDesciption();
    }
    @Override
    public String getCost()
    {
        return coffee.getCost();
    }
}
