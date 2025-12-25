package PRACTISE.Chess.Pices;

import PRACTISE.Chess.Strategies.KingMovementStrategy;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 8: CONCRETE PIECE CLASSES
 * ══════════════════════════════════════════════════════════════════
 * 
 * Each piece class:
 *   1. Extends Piece
 *   2. Passes its specific MovementStrategy to parent constructor
 *   3. Implements getSymbol() to return its symbol
 */

// ═══════════════════════════════════════════════════════════════════
// KING
// ═══════════════════════════════════════════════════════════════════

class King extends Piece{
    public King(boolean isWhite){
        super(isWhite,new new KingMovementStrategy());
    }
    @Override
    public String getSymbol({
        return isWhite()+"king";
    })
}
