package PRACTISE.Chess.Strategies;

/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 5: MOVEMENT STRATEGY INTERFACE
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STRATEGY PATTERN ⭐
 * 
 * This is the CONTRACT for all piece movements.
 * 
 * WHY STRATEGY PATTERN?
 * ─────────────────────
 * Each piece moves differently:
 *   - King: 1 square any direction
 *   - Queen: Any squares any direction
 *   - Rook: Horizontal/Vertical only
 *   - Bishop: Diagonal only
 *   - Knight: L-shape
 *   - Pawn: Forward only
 * 
 * Instead of putting all logic in one place,
 * we create SEPARATE STRATEGY for each piece!
 * 
 * 
 * STRUCTURE:
 * ──────────
 *          ┌─────────────────────────────┐
 *          │    MovementStrategy         │
 *          │    (Interface)              │
 *          │─────────────────────────────│
 *          │ + canMove(board, start, end)│
 *          └──────────────┬──────────────┘
 *                         │
 *          ┌──────┬───────┼───────┬──────┐
 *          ▼      ▼       ▼       ▼      ▼
 *       ┌─────┐┌─────┐┌─────┐┌─────┐┌─────┐
 *       │King ││Queen││Rook ││Bisho││Knigh│
 *       │Move ││Move ││Move ││pMove││tMove│
 *       │Strat││Strat││Strat││Strat││Strat│
 *       └─────┘└─────┘└─────┘└─────┘└─────┘
 */

public interface MovementStrategy {
    boolean canMove(Board board,Cell startCell,Cell endCell);
}


/*
 * ══════════════════════════════════════════════════════════════════
 *                 INTERVIEW EXPLANATION
 * ══════════════════════════════════════════════════════════════════
 * 
 * When interviewer asks: "Why Strategy Pattern here?"
 * 
 * Answer:
 * ───────
 * "I used Strategy Pattern for piece movements because:
 * 
 * 1. DIFFERENT ALGORITHMS: Each piece has unique movement rules
 * 
 * 2. SINGLE RESPONSIBILITY: Movement logic is separate from piece data
 * 
 * 3. OPEN/CLOSED: Can add new piece types without modifying existing code
 *    - Just create new MovementStrategy class
 *    - No change to Piece class or other strategies
 * 
 * 4. TESTABILITY: Can test each movement strategy independently
 * 
 * 5. RUNTIME FLEXIBILITY: Could theoretically swap strategies
 *    (useful for chess variants or piece promotions)"
 */
