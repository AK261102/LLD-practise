package QUESTIONS.TicTaeToe_Me.models;

/**
 * Board class manages the game board state.
 *
 * LLD Principles:
 * - Single Responsibility: Only handles board operations (create, display, update)
 * - Encapsulation: Board state is private, accessed through methods
 */
public class Board {
    private Symbols[][] grid;
    private int size;
    private int filledCells;

    public Board(int size) {
        this.size = size;
        this.grid = new Symbols[size][size];
        this.filledCells = 0;
        initializeBoard();
    }

    /**
     * Initialize all cells to EMPTY
     */
    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = Symbols.EMPTY;
            }
        }
    }

    /**
     * Display the current board state
     */
    public void displayBoard() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String symbol = getDisplaySymbol(grid[i][j]);
                System.out.print(" " + symbol + " ");
                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < size - 1) {
                printSeparator();
            }
        }
        System.out.println();
    }

    private String getDisplaySymbol(Symbols symbol) {
        switch (symbol) {
            case X: return "X";
            case O: return "O";
            default: return " ";
        }
    }

    private void printSeparator() {
        for (int j = 0; j < size; j++) {
            System.out.print("---");
            if (j < size - 1) {
                System.out.print("+");
            }
        }
        System.out.println();
    }

    /**
     * Place a symbol at the given position
     * @return true if move was successful, false if cell is occupied or invalid
     */
    public boolean placeSymbol(int row, int col, Symbols symbol) {
        if (!isValidPosition(row, col)) {
            System.out.println("Invalid position! Row and column must be between 0 and " + (size - 1));
            return false;
        }
        if (!isCellEmpty(row, col)) {
            System.out.println("Cell is already occupied! Choose another cell.");
            return false;
        }
        grid[row][col] = symbol;
        filledCells++;
        return true;
    }

    /**
     * Check if position is within board bounds
     */
    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    /**
     * Check if a cell is empty
     */
    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == Symbols.EMPTY;
    }

    /**
     * Check if the board is completely filled
     */
    public boolean isFull() {
        return filledCells == size * size;
    }

    /**
     * Get symbol at a specific position
     */
    public Symbols getSymbolAt(int row, int col) {
        if (isValidPosition(row, col)) {
            return grid[row][col];
        }
        return null;
    }

    /**
     * Get the board size
     */
    public int getSize() {
        return size;
    }

    /**
     * Get the entire grid (for win checking strategies)
     */
    public Symbols[][] getGrid() {
        return grid;
    }
}
