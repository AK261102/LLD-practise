package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities;

import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.Symbols;

public class Cell {
    private int row;
    private int col;
    private Symbols symbols;

    public Cell(int row,int col)
    {
        this.row=row;
        this.col=col;
        this.symbols=null;
    }
    
    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public Symbols getSymbols()
    {
        return symbols;
    }

    public void setSymbols(Symbols symbols)
    {
        this.symbols=symbols;
    }
}
