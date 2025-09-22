package Abstract_Design_Pattern.Good_Code.Concrete_Factories;

import Abstract_Design_Pattern.Good_Code.Concrete_Car_Brand.BMW;
import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;
import Abstract_Design_Pattern.Good_Code.Interfaces.VehicleFactory;

public class ToyotaFactory implements VehicleFactory {
    public Vehicle createVehicle(){
        return new BMW();
    }
}
