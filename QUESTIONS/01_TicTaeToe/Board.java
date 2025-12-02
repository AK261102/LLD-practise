/**
 * 
 * creating a board class
 * 
 * board class implementation
 * stores grid -> make moves on the grid -> check if the cell is valid/empty -> display the board
 */

public class Board{

    private int size;
    private Symbols[][] grid;

    public Board(int size)
    {
        this.size=size;
        this.grid=grid[size][size];
        
        // intialize all the grid cells

        intializeAllGrid();
    }

    //helper function to intialize all grid cells

    private void intializeAllGrid()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                grid[i][j]=Symbols.EMPTY;
            }
        }
    }

    // function to check whether the move is valid or not

    public boolean isValidMove(int row,int col)
    {
        if(row<0 || col<0 || row>=size || col>=size)
            return false;

        return grid[row][col]==Symbols.EMPTY;
    }

    // function to place the symbols at the riight place

    public boolean makeMove(int row, int col, Symbols symbols)
    {
        if(!isValidMove(row,col))
            return false;

        grid[row][col]=symbols;
        return true;
    }

    // get the symbols are position

    public Symbols getSymbolsAt(int row,int col)
    {
        return grid[row][col];
    }

    // check if the board is empty

    public boolean isFull(){
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(grid[i][j]==Symbols.EMPTY)
                    return false;
            }
        }
        return true;
    }

    int getBoardSize()
    {
        return size;
    }

    // i want to print the board

    public void printBoard(){
        System.out.println();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                String symbol = (grid[i][j]==Symbols.EMPTY) ? " ":grid[i][j].tostring();
                System.out.print(" "+symbol+" ");

                if(j<size-1)
                {
                 System.out.print("|");
                }
            }
            System.out.println();
            if(i<size-1)
                printSeparator();
        }
        System.out.println();
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
}