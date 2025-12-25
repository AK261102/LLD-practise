package PRACTISE.Parking_Alot.strategy;

import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;
import PRACTISE.Parking_Alot.core.Durationtype;

/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 4: PARKING FEE STRATEGY
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STRATEGY PATTERN ⭐
 * 
 * WHY STRATEGY FOR FEE?
 * ─────────────────────
 * Different parking lots may have different pricing:
 *   - Basic hourly rates
 *   - Premium rates (mall parking)
 *   - Weekend special rates
 *   - Peak hour rates
 * 
 * Instead of if-else in one place:
 *   if (isPremium) { ... }
 *   else if (isWeekend) { ... }
 * 
 * Use Strategy Pattern:
 *   - Define interface
 *   - Each pricing model = separate class
 *   - Swap at runtime!
 * 
 * 
 * STRUCTURE:
 * ──────────
 *       ┌────────────────────────┐
 *       │  ParkingFeeStrategy    │
 *       │      (Interface)       │
 *       └───────────┬────────────┘
 *                   │
 *          ┌────────┴────────┐
 *          ▼                 ▼
 *    ┌───────────┐     ┌───────────┐
 *    │  Basic    │     │ Premium   │
 *    │  Hourly   │     │   Rate    │
 *    └───────────┘     └───────────┘
 */

public class ParkingFeeStrategy {
    
    double calculateFee(Vehicle vehicleType,int duration,Durationtype durationtime);
}
