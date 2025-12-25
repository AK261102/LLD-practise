package PRACTISE.Chess.Pices;


/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 9: PIECE FACTORY
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ FACTORY PATTERN ⭐
 * 
 * WHAT IS FACTORY PATTERN?
 * ────────────────────────
 * A class that creates objects for you.
 * 
 * Instead of:
 *   Piece piece = new King(true);
 *   Piece piece = new Queen(true);
 *   Piece piece = new Rook(true);
 *   // ... scattered everywhere in code
 * 
 * Use Factory:
 *   Piece piece = PieceFactory.createPiece("king", true);
 *   Piece piece = PieceFactory.createPiece("queen", true);
 *   // One place to create all pieces!
 * 
 * 
 * WHY FACTORY PATTERN?
 * ────────────────────
 * 1. CENTRALIZED CREATION: All piece creation in one place
 * 
 * 2. EASY TO CHANGE: Need to modify piece creation? Change one place!
 * 
 * 3. CONSISTENT INTERFACE: Always create pieces the same way
 * 
 * 4. HIDES COMPLEXITY: User doesn't need to know about constructors
 * 
 * 5. EXTENSIBILITY: Add new piece type? Just add case in factory!
 */

public class PieceFactory {
    
    public static Piece createPiece(String pieceType,boolean isWhite){

        switch (pieceType.toLowerCase()) {
            case "king":
                return new King(isWhite);
                break;
        
            default:
                break;
        }
    }
}
