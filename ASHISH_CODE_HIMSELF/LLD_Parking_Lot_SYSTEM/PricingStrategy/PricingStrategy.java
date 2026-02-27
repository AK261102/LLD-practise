package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.PricingStrategy;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Vehicle;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Ticket;
public interface PricingStrategy {
    double calculateFee(Ticket ticket,Vehicle vehicle);
}
