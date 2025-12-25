package PRACTISE.Parking_Alot;

import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;
import PRACTISE.Parking_Alot.Vehicles.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        ParkingaLot parking = ParkingAlot.getInstance("City mall");

        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.add(vehicleType.BIKE, 3,1);
        parking.add(floor1);
        parking.setFeeStrategy();

        Vehicle bike1= VehicleFactory.createVehicle(vehicleType.BIKE,,"isjndgin");
        ParkingSpot spot1=parking.partVehicle(bike1);
    }
}
