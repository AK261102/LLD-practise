package PRACTISE.Chess.Strategies;

import PRACTISE.Tic_Tac_Toe.Board;

/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 6A: KING MOVEMENT STRATEGY
 * ══════════════════════════════════════════════════════════════════
 * 
 * KING MOVEMENT RULE:
 * ───────────────────
 * King can move 1 square in ANY direction
 * 
 *      ┌───┬───┬───┐
 *      │ ↖ │ ↑ │ ↗ │
 *      ├───┼───┼───┤
 *      │ ← │ ♔ │ → │  ← King at center
 *      ├───┼───┼───┤
 *      │ ↙ │ ↓ │ ↘ │
 *      └───┴───┴───┘
 * 
 * Valid moves: All 8 surrounding squares
 * Max distance: 1 square
 */
public class KingMovementStrategy implements MovementStrategy {
    @Override
    public boolean canMove(Board board,Cell startCell,Cell endCell){
    int rowDiff=Math.abs(endCell.getRow()-startCell.getRow());
    int colDiff=Math.abs(endCell.getCol()-startCell.getCol());
    if (rowDiff <= 1 && colDiff <= 1) {
            // Not staying in same place
            if (rowDiff == 0 && colDiff == 0) {
                return false;
            }
            return true;
        }
        return false;
    }
    

}
