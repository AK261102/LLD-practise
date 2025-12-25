package PRACTISE.Snake&Food.Strategy;


/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 3: MOVEMENT STRATEGY (INTERFACE)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STRATEGY PATTERN ⭐
 * 
 * WHY STRATEGY PATTERN?
 * ─────────────────────
 * Snake can be controlled by:
 *   - Human player (keyboard input)
 *   - AI (autonomous movement)
 * 
 * Instead of if-else everywhere:
 *   if (isHuman) { ... }
 *   else if (isAI) { ... }
 * 
 * Use Strategy Pattern:
 *   - Define interface
 *   - Each type implements it
 *   - Swap at runtime!
 * 
 * 
 * STRUCTURE:
 * ──────────
 *       ┌────────────────────────┐
 *       │   MovementStrategy     │
 *       │      (Interface)       │
 *       │────────────────────────│
 *       │ + getNextPosition()    │
 *       └───────────┬────────────┘
 *                   │
 *          ┌────────┴────────┐
 *          ▼                 ▼
 *    ┌───────────┐     ┌───────────┐
 *    │  Human    │     │    AI     │
 *    │ Strategy  │     │ Strategy  │
 *    └───────────┘     └───────────┘
 */


public interface MovementStrategy {
    Pair getNextPosition(Pair currentHead, String direction);
}
