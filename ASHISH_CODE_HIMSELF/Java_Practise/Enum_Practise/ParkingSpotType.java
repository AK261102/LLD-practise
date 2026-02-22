package ASHISH_CODE_HIMSELF.Java_Practise.Enum_Practise;

public enum ParkingSpotType {
    
    private final String carName;
    private final int licensePlate;

    public ParkingSpotType(String carName,int licensePlate)
    {
        this.carName=carName;
        this.licensePlate=licensePlate;
    }

    public String getCarName()
    {
        return carName;
    }

    public int getLicensePlate()
    {
        return licensePlate;
    }

    public int calculateFee(int hours)
    {
        return hours*22;
    }
}
/**
 * 
 * double fee =ParkingSpotType.calculate(5);
 */