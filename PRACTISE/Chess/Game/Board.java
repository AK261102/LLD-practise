package PRACTISE.Chess.Game;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 10: BOARD CLASS (SINGLETON)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ SINGLETON PATTERN ⭐
 * 
 * WHAT IS SINGLETON?
 * ──────────────────
 * A pattern that ensures ONLY ONE instance of a class exists.
 * 
 * WHY SINGLETON FOR BOARD?
 * ────────────────────────
 * - There's only ONE chess board in a game
 * - Multiple board instances would cause chaos
 * - Everyone should access the SAME board
 * 
 * 
 * HOW SINGLETON WORKS:
 * ────────────────────
 * 1. Private constructor (can't create from outside)
 * 2. Private static instance variable
 * 3. Public static getInstance() method
 * 
 *    ┌─────────────────────────────────────────┐
 *    │  Board (Singleton)                      │
 *    │─────────────────────────────────────────│
 *    │ - static instance: Board                │
 *    │ - cells: Cell[8][8]                     │
 *    │─────────────────────────────────────────│
 *    │ - private Board()                       │ ← Can't create directly
 *    │ + static getInstance(): Board           │ ← Only way to get Board
 *    └
 */
public class Board {
    private static Board instance;

    private Cell[][] cells;
    private int size;

    private Board(int size)
    {
        this.size=size;
        intializeBoard();
    }
    public static Board getInstance(int size){
        if(instance==null)
            instance=new Board(size);
        return instance;
    }

    public static void resetInstance(){
        instance=null;
    }

       // ─────────────────────────────────────────────────────────────
        // INITIALIZE BOARD
        // ─────────────────────────────────────────────────────────────
        
        /**
         * Set up initial board with all pieces
         * 
         * Standard chess starting position:
         * 
         *    0   1   2   3   4   5   6   7
         *  ┌───┬───┬───┬───┬───┬───┬───┬───┐
         * 0│ ♜ │ ♞ │ ♝ │ ♛ │ ♚ │ ♝ │ ♞ │ ♜ │ Black pieces
         *  ├───┼───┼───┼───┼───┼───┼───┼───┤
         * 1│ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │ Black pawns
         *  ├───┼───┼───┼───┼───┼───┼───┼───┤
         * 2│   │   │   │   │   │   │   │   │
         *  ├───┼───┼───┼───┼───┼───┼───┼───┤
         * 3│   │   │   │   │   │   │   │   │ Empty rows
         *  ├───┼───┼───┼───┼───┼───┼───┼───┤
         * 4│   │   │   │   │   │   │   │   │
         *  ├───┼───┼───┼───┼───┼───┼───┼───┤
         * 5│   │   │   │   │   │   │   │   │
         *  ├───┼───┼───┼───┼───┼───┼───┼───┤
         * 6│ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │ White pawns
         *  ├───┼───┼───┼───┼───┼───┼───┼───┤
         * 7│ ♖ │ ♘ │ ♗ │ ♕ │ ♔ │ ♗ │ ♘ │ ♖ │ White pieces
         *  └───┴───┴───┴───┴───┴───┴───┴───┘
         */
        private void initializeBoard() {
            cells = new Cell[size][size];
            
            // Row 0: Black major pieces
            setPieceRow(0, false);
            
            // Row 1: Black pawns
            setPawnRow(1, false);
            
            // Rows 2-5: Empty
            for (int row = 2; row < size - 2; row++) {
                for (int col = 0; col < size; col++) {
                    cells[row][col] = new Cell(row, col, null);
                }
            }
            
            // Row 6: White pawns
            setPawnRow(6, true);
            
            // Row 7: White major pieces
            setPieceRow(7, true);
        }
        
        /**
         * Set major pieces for a row
         * Order: Rook, Knight, Bishop, Queen, King, Bishop, Knight, Rook
         */
        private void setPieceRow(int row, boolean isWhite) {
            cells[row][0] = new Cell(row, 0, PieceFactory.createPiece("rook", isWhite));
            cells[row][1] = new Cell(row, 1, PieceFactory.createPiece("knight", isWhite));
            cells[row][2] = new Cell(row, 2, PieceFactory.createPiece("bishop", isWhite));
            cells[row][3] = new Cell(row, 3, PieceFactory.createPiece("queen", isWhite));
            cells[row][4] = new Cell(row, 4, PieceFactory.createPiece("king", isWhite));
            cells[row][5] = new Cell(row, 5, PieceFactory.createPiece("bishop", isWhite));
            cells[row][6] = new Cell(row, 6, PieceFactory.createPiece("knight", isWhite));
            cells[row][7] = new Cell(row, 7, PieceFactory.createPiece("rook", isWhite));
        }
        
        /**
         * Set pawns for a row
         */
        private void setPawnRow(int row, boolean isWhite) {
            for (int col = 0; col < size; col++) {
                cells[row][col] = new Cell(row, col, PieceFactory.createPiece("pawn", isWhite));
            }
        }
        
        // ─────────────────────────────────────────────────────────────
        // GETTERS
        // ─────────────────────────────────────────────────────────────
        
        public int getSize() {
            return size;
        }
        
        public Cell getCell(int row, int col) {
            if (row < 0 || row >= size || col < 0 || col >= size) {
                return null;
            }
            return cells[row][col];
        }
        
        // ─────────────────────────────────────────────────────────────
        // PRINT BOARD
        // ─────────────────────────────────────────────────────────────
        
        public void print() {
            System.out.println();
            System.out.println("     0   1   2   3   4   5   6   7");
            System.out.println("   ┌───┬───┬───┬───┬───┬───┬───┬───┐");
            
            for (int row = 0; row < size; row++) {
                System.out.print(" " + row + " │");
                
                for (int col = 0; col < size; col++) {
                    Piece piece = cells[row][col].getPiece();
                    String symbol = (piece != null) ? piece.getSymbol() : " ";
                    System.out.print(" " + symbol + " │");
                }
                
                System.out.println();
                
                if (row < size - 1) {
                    System.out.println("   ├───┼───┼───┼───┼───┼───┼───┼───┤");
                }
            }
            
            System.out.println("   └───┴───┴───┴───┴───┴───┴───┴───┘");
            System.out.println();
        }
    }
}
