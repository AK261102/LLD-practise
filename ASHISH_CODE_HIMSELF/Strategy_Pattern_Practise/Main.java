package ASHISH_CODE_HIMSELF.Strategy_Pattern_Practise;


public class Main {
    public static void main(String[] args) {
        ParkingFeeStrategy weekDayStrategy= new WeekdayFeeStrategy();
        ParkingLot parkingLot= new ParkingLot(weekDayStrategy);
        double fee=parkingLot.calculateParkingFee(VehicleType.CAR, 3);
    }
}
