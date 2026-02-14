package ASHISH_CODE_HIMSELF.Parking_Lot.Fee;

import java.util.HashMap;
import java.util.Map;

import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.Ticket;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.VehicleType;

public class HourRateFeeCalculator implements FeeCalculator {
    private Map<VehicleType, Double> ratePerHour;

    public HourRateFeeCalculator()
    {
        ratePerHour = new HashMap<>();
        ratePerHour.put(VehicleType.BIKE, 10.0);
        ratePerHour.put(VehicleType.CAR, 20.0);
        ratePerHour.put(VehicleType.TRUCK, 40.0);
    }

    @Override
    public double calculateFee(Ticket ticket)
    {
        long hours = java.time.Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours();
        hours = Math.max(1, hours);
        double rate = ratePerHour.getOrDefault(ticket.getVehicle().getType(), 20.0);
        return rate * hours;
    }
}
