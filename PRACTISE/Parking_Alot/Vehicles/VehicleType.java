package PRACTISE.Parking_Alot.Vehicles;


/**
 * Vehicle is ABSTRACT because
 * core generic logic is same every where
 * but all the vehicles have common properities
 */
public abstract class VehicleType {
    public String licenePlate;
    public VehicleType type;

    public Vehicle(String licenePlate, VehicleType type)
    {
        this.licenePlate=licenePlate;
        this.type=type;
    }
      public String getLicensePlate() {
        return licensePlate;
    }
    
    public VehicleType getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return type + " [" + licensePlate + "]";
    }


}
