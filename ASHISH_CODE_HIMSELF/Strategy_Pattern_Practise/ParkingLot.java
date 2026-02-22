package ASHISH_CODE_HIMSELF.Strategy_Pattern_Practise;

public class ParkingLot {
    private ParkingFeeStrategy feeStrategy;

    public ParkingLot(ParkingFeeStrategy feeStrategy)
    {
        this.feeStrategy=feeStrategy;
    }
    // use a setter to swap algo at runtime;
    public ParkingLot(ParkingFeeStrategy feeStrategy)
    {
        this.feeStrategy=feeStrategy;
    }

    public double calculateParkingFee(VehicleType type,int hours)
    {
        return feeStrategy.calculateFee(type, hours);
    }
}
