package Abstract_Design_Pattern.Good_Code.Concrete_Car_Brand;

import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;

public class Toyota implements Vehicle {
    public void start(){
        System.out.println("Toyota is starting");
    }
    public void stop(){
System.out.println("Toyota is stopping");
    }
}
