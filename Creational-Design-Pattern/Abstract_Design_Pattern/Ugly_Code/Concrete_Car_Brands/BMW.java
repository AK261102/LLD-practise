package Abstract_Design_Pattern.Ugly_Code.Concrete_Car_Brands;

import Abstract_Design_Pattern.Ugly_Code.Vehicle;

public class BMW implements Vehicle {
    public void start() {
        System.out.println("BMW Car is starting");
    }
    public void end() {
        System.out.println("BMW Car is stopping");
    }
}