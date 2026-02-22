package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import java.util.ArrayList;
import java.util.stream.Collectors;

import ASHISH_CODE_HIMSELF.Factory_Pattern_Practise.VehiceType;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;
import ASHISH_CODE_HIMSELF.Parking_Lot_Practise-SELF.*;

-SELF.models;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpot = new ArrayList<>()

    public ParkingFloor(int floorNumber, List<ParkingSpot> parkingSpot)
    {
        this.floorNumber=floorNumber;
        this.parkingSpot=parkingSpot;
    }

    public void addSpot(ParkingSpot spot)
    {
        parkingSpot.add(spot);
    }

     /**
     * Find all available spots that can fit the given vehicle type.
     */
    public List<ParkingSpot> getAvaliableSpots(VehiceType vehiceType)
    {
        return parkingSpot.stream().filter(parkingSpot -> parkingSpot.canFit(vehiceType)).collect(Collectors.toList());
    }

    public parkingSpot findFirstAvaliableSpot(VehicleTypes vehicle)
    {
        for(ParkingSpot spot:parkingSpot)
        {
            if(spot.canFit(vehicle))
            {
                return spot;
            }
        }
        return null;
    }

    public int countOfAvaliableVehicleSpot(VehicleTypes vehicles)
    {
        int cnt=0;
        for(parkingSpot spot:parkingSpot)
        {
            if(spot.canFit(vehicles))
                cnt++;
        }
        return cnt;
    }

    public int countOfAvaliableSpot()
    {
        int cnt=0;
        for(ParkingSpot spot: parkingSpot)
        {
            if(spot.isAvaliable())
                cnt++;
        }
        return cnt;
    }
}
