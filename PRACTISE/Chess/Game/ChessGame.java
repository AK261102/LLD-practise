package PRACTISE.Chess.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import PRACTISE.Chess.Pices.Piece;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 11: CHESS GAME CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * ChessGame is the CONTROLLER that orchestrates everything:
 *   - Manages players
 *   - Handles turns
 *   - Validates moves
 *   - Tracks game status
 *   - Detects win/draw conditions
 * 
 * 
 * GAME FLOW:
 * ──────────
 *     START
 *       │
 *       ▼
 *   ┌───────────┐
 *   │Show Board │◄─────────────────────┐
 *   └─────┬─────┘                      │
 *         │                            │
 *         ▼                            │
 *   ┌───────────┐                      │
 *   │Get Move   │                      │
 *   │from Player│                      │
 *   └─────┬─────┘                      │
 *         │                            │
 *         ▼                            │
 *   ┌───────────┐   Invalid            │
 *   │Validate   │──────────────────────┤
 *   │Move       │                      │
 *   └─────┬─────┘                      │
 *         │ Valid                      │
 *         ▼                            │
 *   ┌───────────┐                      │
 *   │Execute    │                      │
 *   │Move       │                      │
 *   └─────┬─────┘                      │
 *         │                            │
 *         ▼                            │
 *   ┌───────────┐   No                 │
 *   │King       │──────────────────────┤
 *   │Captured?  │                      │
 *   └─────┬─────┘                      │
 *         │ Yes                        │
 *         ▼                            │
 *   ┌───────────┐                      │
 *   │ GAME OVER │ → Switch Turn ───────┘
 *   └───────────┘
 */

public class ChessGame {
    
    private Board board;
    private Player player1;
    private Player player2;
    private boolean isWhiteTurn;
    private boolean status;
    private List<Move> moveHistory;

    public ChessGame(Player player1,Player player2)
    {
        this.player1=player1;
        this.player2=player2;
        this.board=Board.getInstance(8);
        this.isWhiteTurn=true;
        this.status=GameStatus.ACTIVE;
        this.moveHistory=new ArrayList();
    }
     // ─────────────────────────────────────────────────────────────
    // START GAME
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Main game loop
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        printWelcome();
        
        // Game loop - continues while game is active
        while (status == GameStatus.ACTIVE) {
            
            // Show current board
            board.print();
            
            // Get current player
            Player currentPlayer = isWhiteTurn ? player1 : player2;
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println(currentPlayer.getName() + "'s turn (" + 
                             (isWhiteTurn ? "White" : "Black") + ")");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            
            // Get move from player
            System.out.print("Enter start position (row col): ");
            int startRow = scanner.nextInt();
            int startCol = scanner.nextInt();
            
            System.out.print("Enter end position (row col): ");
            int endRow = scanner.nextInt();
            int endCol = scanner.nextInt();
            
            // Get cells
            Cell startCell = board.getCell(startRow, startCol);
            Cell endCell = board.getCell(endRow, endCol);
            
            // Validate cells exist
            if (startCell == null || endCell == null) {
                System.out.println("❌ Invalid position! Try again.");
                continue;
            }
            
            // Create move
            Move move = new Move(startCell, endCell);
            
            // Try to make the move
            if (!makeMove(move, currentPlayer)) {
                System.out.println("❌ Invalid move! Try again.");
                continue;
            }
            
            System.out.println("✓ Move successful: " + move);
        }
        
        // Game ended
        board.print();
        printResult();
    }

     // ─────────────────────────────────────────────────────────────
    // MAKE MOVE
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Validate and execute a move
     * 
     * @param move   The move to make
     * @param player The player making the move
     * @return true if move was successful
     */
    public boolean makeMove(Move move, Player player) {
        
        Cell startCell = move.getStartCell();
        Cell endCell = move.getEndCell();
        
        // ─────────────────────────────────────────────────────────
        // VALIDATION 1: Is there a piece at start?
        // ─────────────────────────────────────────────────────────
        
        Piece sourcePiece = startCell.getPiece();
        if (sourcePiece == null) {
            System.out.println("   No piece at start position!");
            return false;
        }
        
        // ─────────────────────────────────────────────────────────
        // VALIDATION 2: Is it the player's piece?
        // ─────────────────────────────────────────────────────────
        
        if (sourcePiece.isWhite() != player.isWhiteSide()) {
            System.out.println("   That's not your piece!");
            return false;
        }
        
        // ─────────────────────────────────────────────────────────
        // VALIDATION 3: Basic move validity (not capturing own piece)
        // ─────────────────────────────────────────────────────────
        
        if (!move.isValid()) {
            System.out.println("   Can't capture your own piece!");
            return false;
        }
        
        // ─────────────────────────────────────────────────────────
        // VALIDATION 4: Can this piece make this move?
        // (Uses Strategy Pattern!)
        // ─────────────────────────────────────────────────────────
        
        if (!sourcePiece.canMove(board, startCell, endCell)) {
            System.out.println("   This piece can't move that way!");
            return false;
        }
        
        // ─────────────────────────────────────────────────────────
        // EXECUTE MOVE
        // ─────────────────────────────────────────────────────────
        
        Piece destinationPiece = endCell.getPiece();
        
        // Check if capturing King (game over!)
        if (destinationPiece != null && destinationPiece instanceof King) {
            if (isWhiteTurn) {
                status = GameStatus.WHITE_WIN;
            } else {
                status = GameStatus.BLACK_WIN;
            }
        }
        
        // If capturing a piece, mark it as killed
        if (destinationPiece != null) {
            destinationPiece.setKilled(true);
            System.out.println("   Captured " + destinationPiece.getSymbol() + "!");
        }
        
        // Move piece to new position
        endCell.setPiece(sourcePiece);
        startCell.setPiece(null);
        
        // Log the move
        moveHistory.add(move);
        
        // Switch turn
        isWhiteTurn = !isWhiteTurn;
        
        return true;
    }
    
}
