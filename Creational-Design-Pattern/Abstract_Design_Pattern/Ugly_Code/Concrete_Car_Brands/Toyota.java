package Abstract_Design_Pattern.Ugly_Code.Concrete_Car_Brands;

import Abstract_Design_Pattern.Ugly_Code.Vehicle;

public class Toyota implements Vehicle {
    public void start() {
        System.out.println("Toyota Car is starting");
    }
    public void end() {
        System.out.println("Toyota Car is stopping");
    }
}