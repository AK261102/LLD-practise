package PRACTISE.Vending_Machine_System.states;


/**
 * ══════════════════════════════════════════════════════════════════
 *          STEP 5: VENDING MACHINE STATE INTERFACE
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STATE PATTERN ⭐
 * 
 * WHY STATE PATTERN?
 * ──────────────────
 * Vending machine behaves differently in each state:
 * 
 *   IDLE STATE:
 *     - Can insert coins ✓
 *     - Cannot select product ✗
 *     - Cannot dispense ✗
 * 
 *   HAS_MONEY STATE:
 *     - Can insert more coins ✓
 *     - Can select product ✓
 *     - Cannot dispense yet ✗
 * 
 *   SELECTION STATE:
 *     - Cannot insert coins ✗
 *     - Can choose product ✓
 *     - Will dispense if paid ✓
 * 
 *   DISPENSE STATE:
 *     - Cannot insert coins ✗
 *     - Cannot select ✗
 *     - Dispenses product ✓
 * 
 * 
 * STRUCTURE:
 * ──────────
 *       ┌────────────────────────────┐
 *       │   VendingMachineState      │
 *       │       (Interface)          │
 *       └─────────────┬──────────────┘
 *                     │
 *       ┌─────────────┼─────────────┬─────────────┐
 *       ▼             ▼             ▼             ▼
 *   ┌─────────┐ ┌───────────┐ ┌───────────┐ ┌───────────┐
 *   │  Idle   │ │ HasMoney  │ │ Selection │ │ Dispense  │
 *   │  State  │ │   State   │ │   State   │ │   State   │
 *   └─────────┘ └───────────┘ └───────────┘ └───────────┘
 */

public interface VendingMachineState {

    String getStateName();

    VendingMachineState next(VendingMachineContext context);
}
