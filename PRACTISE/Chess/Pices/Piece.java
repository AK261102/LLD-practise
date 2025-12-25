package PRACTISE.Chess.Pices;

import PRACTISE.Chess.Strategies.MovementStrategy;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 7: PIECE ABSTRACT CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Piece is ABSTRACT because:
 *   - You can't have a "generic piece"
 *   - Every piece must be a King, Queen, Rook, etc.
 *   - But all pieces share common properties
 * 
 * COMMON PROPERTIES:
 *   - isWhite: Color of the piece
 *   - isKilled: Has it been captured?
 *   - movementStrategy: How does it move?
 * 
 * 
 * CLASS HIERARCHY:
 * ────────────────
 *              Piece (abstract)
 *                   │
 *      ┌─────┬──────┼──────┬─────┬─────┐
 *      ▼     ▼      ▼      ▼     ▼     ▼
 *    King  Queen  Rook  Bishop Knight Pawn
 * 
 * 
 * STRATEGY PATTERN IN ACTION:
 * ───────────────────────────
 * Each piece has a MovementStrategy:
 *   - King → KingMovementStrategy
 *   - Queen → QueenMovementStrategy
 *   - etc.
 * 
 * The Piece class doesn't know HOW to move.
 * It DELEGATES to the strategy!
 */
public abstract class Piece {
    private boolean isWhite;
    private boolean isKilled;

    private MovementStrategy strate;

    public Piece(boolean isWhite, MovementStrategy strate){
        this.isWhite=isWhite;
        this.isKilled=isKilled;
        this.strate=strate;
    }


    // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public boolean isWhite() {
        return isWhite;
    }
    
    public boolean isKilled() {
        return isKilled;
    }
    
    // ─────────────────────────────────────────────────────────────
    // SETTERS
    // ─────────────────────────────────────────────────────────────
    
    public void setKilled(boolean killed) {
        this.isKilled = killed;
    }

    public boolean canMove(Board board, Cell startCell, Cell endCell){
        return strate.canMove(board,startCell,endCell);
    }
}
