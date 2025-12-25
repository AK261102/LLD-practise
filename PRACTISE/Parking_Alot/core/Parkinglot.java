package PRACTISE.Parking_Alot.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;
import PRACTISE.Parking_Alot.Vehicles.VehicleType;
import PRACTISE.Parking_Alot.spots.parkingSpot;
import PRACTISE.Parking_Alot.strategy.ParkingFeeStrategy;

public class Parkinglot {
    private static Parkinglot instance;

    private String name;
    private List<ParkingFloor> floors;
    private ParkingFeeStrategy fee;

    private Map<String, ParkingSpot> vehicleSpotMap;
    private Map<String, Long> entryTimeMap;

    public Parkinglot(String name)
    {
        this.name=name;
        this.floors=new ArrayList<>();
        this.fee= new BasicHourly();
        this.entryTimeMap=entryTimeMap;
        this.vehicleSpotMap=vehicleSpotMap;
    }

    public static Parkinglot getInstance(String name){
        if(instance==null)
            instance=new Parkinglot(name);
        return instance;
    }

    public ParkingSpot parkedVehicle(Vehicle vehicle)
    {
        if(vehicleSpotMap.containsKey(vehicle.getLicensePlate()))
            retunr null;

        ParkingSpot spot= availablespace(vehicle.getType());
        if(spot==null)
            return null;
        spot.parkedVehicle(vehicle);
        return spot;
    }

    public ParkingSpot unparkVehicle(Vehicle vehicle)
    {
        parkingSpot spot=vehicleSpotMap.get(licensePlate);
        Vehicle vehicle = spot.getVehicle();
        spot.vacate();
        vehicleSpotMap.remove(licensePlate);
        entryTimeMap.remove(licensePlate);
    }
      * Find first available spot for vehicle type
     * Searches across all floors
     */
    public ParkingSpot findAvailableSpot(VehicleType type) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(type);
            if (spot != null) {
                return spot;
            }
        }
        return null;
    }
}
