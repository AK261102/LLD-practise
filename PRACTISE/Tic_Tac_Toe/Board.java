package PRACTISE.Tic_Tac_Toe;

import Factory_Design_Pattern.bike;
import QUESTIONS.TicTaeToe_Me.models.Symbols;

Board · JAVA
Copy

/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║                      STEP 5: BOARD CLASS                         ║
 * ╠══════════════════════════════════════════════════════════════════╣
 * ║                                                                  ║
 * ║  Board = The 3×3 grid where game is played                       ║
 * ║                                                                  ║
 * ║  Responsibilities:                                               ║
 * ║  ├── Store the grid (2D array of Cells)                          ║
 * ║  ├── Validate moves (is cell empty? is position valid?)          ║
 * ║  ├── Make moves (place X or O)                                   ║
 * ║  ├── Check for winner                                            ║
 * ║  ├── Check if board is full                                      ║
 * ║  └── Display the board                                           ║
 * ║                                                                  ║
 * ║  Visual:                                                         ║
 * ║        col 0   col 1   col 2                                     ║
 * ║       ┌───────┬───────┬───────┐                                  ║
 * ║  row 0│   X   │   O   │       │                                  ║
 * ║       ├───────┼───────┼───────┤                                  ║
 * ║  row 1│       │   X   │       │                                  ║
 * ║       ├───────┼───────┼───────┤                                  ║
 * ║  row 2│   O   │       │   X   │  ← X wins (diagonal)!            ║
 * ║       └───────┴───────┴───────┘                                  ║
 * ║                                                                  ║
 * ╚══════════════════════════════════════════════════════════════════╝
 */

public class Board {
    /**
     * this is the main class to master for the tictactoe design
     * creating a board
     * intialize all cells
     * create cell objects for each position
     * checking if the move is valid , false otherwise
     * a move is valid only if 
     * symbols are filled within 0 to size-1
     * or the cell is empty
     * make a move
     * 
     * check the winner logic
     * check if the last move is made by user by checking the winner line
     * there are four conditions to win
     * 1.row win
     * 2.col win
     * 3.diagonal win
     * 4.anti-diagonal win
     */

    private int size;
    private Cell[][] cells;

    public Board(int size)
    {
        this.size=size;
        this.cells=new Cell[size][size];
        intializeBoard();
    }

    private void intializeBoard()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                cells[i][j]=new Cell(i,j);
            }
        }
    }

    public int getSize(){
        return size;
    }

    public Cell getCell(int row,int col){
        return cells[row][col];
    }

    public Symbol getSymbolAt(int row,int col)
    {
        return cells[row][col].getSymbol();
    }

    public boolean isValidMove(int row,int col)
    {
        if(row<0 || col<0 || row>=size || col>=size)
            return false;

        return cells[row][col].isEmpty();
    }

    public boolean makeMove(int row,int col,Symbol symbol)
    {
        if(!isValidMove(row, col))
        {
            return false;
        }
        cells[row][col].setSymbol(symbol);
        return true;
    }

    public boolean checkWinner(int row,int col,Symbol symbol)
    {
        // think of the optimization , we only need to check lines that include the last move position

        if(checkRow(row,symbol))
            return true;
        if(checkColumn(column,symbol))
            return true;
        if(checkDiagonal(symbol))
            return true;
        if(checkAntiDiagonal(symbol))
            return true;
    }

    private boolean checkRow(int row,Symbol symbol){
        for(int col=0;col<size;col){
            if(cells[row][col].getSymbol()!=symbol)
                return false;
            return true;
        }
    }

    private boolean checkColumn(int row,Symbol symbol)
    {
        for(int row;row<size;row++)
        {
            if(cells[row][col].getSymbol()!=symbol)
                return false;
        }
        return true;
    }


    private boolean checkDiagonal(Symbol symbol)
    {
        for(int i=0;i<size;i++)
        {
            if(cells[i][j].getSymbol()!=symbol)
                return false;
        }
        return true;
    }

    private boolean checkAntiDiagonal(Symbol symbol)
    {
        for(int i=0;i<size;i++)
        {
            if(cells[i][size-i-1].getSymbol()!=symbol)
                return false;
        }
        return true;
    }

    public boolean isFull(){
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(cells[i][j].isEmpty())
                    return false;
            }
        }
        return true;
    }

     // ═══════════════════════════════════════════════════════════════
    // DISPLAY BOARD
    // ═══════════════════════════════════════════════════════════════
    
    /**
     * Print the board to console
     * 
     * Output:
     *     0   1   2
     *   ┌───┬───┬───┐
     * 0 │ X │ O │   │
     *   ├───┼───┼───┤
     * 1 │   │ X │   │
     *   ├───┼───┼───┤
     * 2 │ O │   │ X │
     *   └───┴───┴───┘
     */
    public void print() {
        System.out.println();
        
        // Print column headers
        System.out.print("    ");
        for (int j = 0; j < size; j++) {
            System.out.print("  " + j + " ");
        }
        System.out.println();
        
        // Print top border
        System.out.print("   ┌");
        for (int j = 0; j < size; j++) {
            System.out.print("───");
            if (j < size - 1) System.out.print("┬");
        }
        System.out.println("┐");
        
        // Print rows
        for (int i = 0; i < size; i++) {
            // Row content
            System.out.print(" " + i + " │");
            for (int j = 0; j < size; j++) {
                System.out.print(" " + cells[i][j].getSymbol().getChar() + " ");
                if (j < size - 1) {
                    System.out.print("│");
                }
            }
            System.out.println("│");
            
            // Row separator
            if (i < size - 1) {
                System.out.print("   ├");
                for (int j = 0; j < size; j++) {
                    System.out.print("───");
                    if (j < size - 1) System.out.print("┼");
                }
                System.out.println("┤");
            }
        }
        
        // Print bottom border
        System.out.print("   └");
        for (int j = 0; j < size; j++) {
            System.out.print("───");
            if (j < size - 1) System.out.print("┴");
        }
        System.out.println("┘");
        
        System.out.println();
    }
}


}
