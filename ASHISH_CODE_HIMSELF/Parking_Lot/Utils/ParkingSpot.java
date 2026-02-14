package ASHISH_CODE_HIMSELF.Parking_Lot.Utils;

public class ParkingSpot {
    /***
     * this class is checking the avaliability of the parking spot
     * remember these method as usage only code it
     * 
     */
    private int spotID;
    private SpotType type;
    private SpotStatus status;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotID, SpotType type)
    {
        this.type=type;
        this.spotID=spotID;
        this.status=SpotStatus.AVAILABLE;
    }

    public boolean isAvaliable()
    {
        return status == SpotStatus.AVAILABLE;
    }

    public synchronized boolean parkedVehicle(Vehicle vehicle)
    {
        if(!isAvaliable())
            return false;
        this.parkedVehicle=vehicle;
        this.status=SpotStatus.OCCUPIED;
        return true;
    }

    public synchronized void removeVehicle()
    {
        this.parkedVehicle = null;
        this.status = SpotStatus.AVAILABLE;
    }

    public int getSpotId()
    {
        return spotID;
    }

    public SpotType getSpotType()
    {
        return type;
    }

    public SpotStatus getStatus()
    {
        return status;
    }

    public Vehicle getParkedVehicle()
    {
        return parkedVehicle;
    }
}
