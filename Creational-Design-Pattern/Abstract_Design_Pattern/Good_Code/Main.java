package Abstract_Design_Pattern.Good_Code;

import Abstract_Design_Pattern.Good_Code.Concrete_Factories.BMWFactory;
import Abstract_Design_Pattern.Good_Code.Concrete_Factories.HondaFactory;
import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;
import Abstract_Design_Pattern.Good_Code.Interfaces.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory h1fFactory= new HondaFactory();
        Vehicle honda=h1fFactory.createVehicle();
        honda.start();
        honda.stop();
        VehicleFactory b1Factory=new BMWFactory();
        Vehicle BMW=b1Factory.createVehicle();
        BMW.start();;
        BMW.stop();
    }
}
