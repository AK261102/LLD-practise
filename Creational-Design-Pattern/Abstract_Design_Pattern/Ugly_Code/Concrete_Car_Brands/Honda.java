package Abstract_Design_Pattern.Ugly_Code.Concrete_Car_Brands;

import Abstract_Design_Pattern.Ugly_Code.Vehicle;

public class Honda implements Vehicle {
    public void start() {
        System.out.println("Honda Car is starting");
    }
    public void end() {
        System.out.println("Honda Car is stopping");
    }
}