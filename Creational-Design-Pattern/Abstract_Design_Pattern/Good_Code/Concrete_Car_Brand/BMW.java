package Abstract_Design_Pattern.Good_Code.Concrete_Car_Brand;

import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;

public class BMW implements Vehicle {
    public void start(){
        System.out.println("BMW is starting");
    }
    public void stop(){
System.out.println("BMW is stopping");
    }
}
