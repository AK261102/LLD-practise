package Structural-Design-Patterns.Decorator Design Pattern.Good_Code.Client_Code;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee=new CoffeeShop();
        coffee=new MilkDecorator();
        coffee=new SugarDecorator();
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());
        Coffee anotherCoffee = new Cappuccino();
        anotherCoffee = new VanillaDecorator(anotherCoffee);
        System.out.println("Order: " + anotherCoffee.getDescription());
        System.out.println("Total Cost: $" + anotherCoffee.getCost());
    }
}
