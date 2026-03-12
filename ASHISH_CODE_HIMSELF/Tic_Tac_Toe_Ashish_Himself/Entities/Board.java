package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities;

public class Board {
    private int size;
    private Cell[][] grid;

    public Board(int size)
    {
        this.size=size;
        this.grid=new Cell[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                grid[i][j]=new Cell(i, j);
            }
        }
    }

    public getSize()
    {
        return size;
    }
    public getCellSymbols(int i,int j)
    {
        return grid[i][j];
    }

     public boolean isFull() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (grid[i][j].isEmpty())
                    return false;  // found empty cell
        return true;  // no empty cells
    }
}
