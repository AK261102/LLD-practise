package PRACTISE.Elevator_System.dispatcher;

/**
 * ══════════════════════════════════════════════════════════════════
 *              NEAREST ELEVATOR STRATEGY
 * ══════════════════════════════════════════════════════════════════
 * 
 * Most commonly used in real elevator systems!
 * 
 * ALGORITHM:
 * ──────────
 * 1. Calculate "suitability score" for each elevator
 * 2. Select elevator with highest score
 * 
 * SCORE FACTORS:
 *   - Distance to request floor (closer = better)
 *   - Direction match (same direction = bonus)
 *   - State (IDLE = bonus)
 * 
 * 
 * EXAMPLE:
 * ────────
 * Request: Floor 5, Direction UP
 * 
 * Elevator A: Floor 3, Going UP     
 *   → Distance = 2
 *   → Same direction = BONUS
 *   → Score = HIGH ✓ SELECTED
 * 
 * Elevator B: Floor 7, Going DOWN   
 *   → Distance = 2
 *   → Opposite direction = no bonus
 *   → Score = MEDIUM
 * 
 * Elevator C: Floor 10, IDLE        
 *   → Distance = 5
 *   → IDLE = bonus
 *   → Score = LOW
 */

public class NearestElevatorstrategy implements Dispatchstrategy {
    
}
