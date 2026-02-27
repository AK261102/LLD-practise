package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.PricingStrategy;

import java.time.LocalDateTime;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Ticket;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Vehicle;
import java.time.Duration;

public class BikePricing implements PricingStrategy {
    @Override
    public double calculateFee(Ticket ticket,Vehicle vehicle)
    {
        LocalDateTime entryTime=ticket.getEntryTime();
        LocalDateTime exitTime=ticket.getExitTime();
        
        return Duration.between(entryTime, exitTime).toHours()*1.5;

    }
}
