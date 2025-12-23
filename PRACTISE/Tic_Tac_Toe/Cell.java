package PRACTISE.Tic_Tac_Toe;

import QUESTIONS.TicTaeToe_Me.models.Symbols;

/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║                      STEP 3: CELL CLASS                          ║
 * ╠══════════════════════════════════════════════════════════════════╣
 * ║                                                                  ║
 * ║  Cell = Ek single box on the board                               ║
 * ║                                                                  ║
 * ║       col 0   col 1   col 2                                      ║
 * ║      ┌───────┬───────┬───────┐                                   ║
 * ║ row 0│ Cell  │ Cell  │ Cell  │                                   ║
 * ║      │(0,0)  │(0,1)  │(0,2)  │                                   ║
 * ║      ├───────┼───────┼───────┤                                   ║
 * ║ row 1│ Cell  │ Cell  │ Cell  │                                   ║
 * ║      │(1,0)  │(1,1)  │(1,2)  │                                   ║
 * ║      ├───────┼───────┼───────┤                                   ║
 * ║ row 2│ Cell  │ Cell  │ Cell  │                                   ║
 * ║      │(2,0)  │(2,1)  │(2,2)  │                                   ║
 * ║      └───────┴───────┴───────┘                                   ║
 * ║                                                                  ║
 * ║  Each cell knows:                                                ║
 * ║  - Its position (row, col)                                       ║
 * ║  - What symbol is in it (X, O, or EMPTY)                         ║
 * ║                                                                  ║
 * ╚══════════════════════════════════════════════════════════════════╝
 */


public class Cell {
    /*
    final means , set is once and cannot change
    that's why i kept it final

    symbols would not be final because because intiall all the cells were empty and then player make a move

    why we need getters
    attributes are private encapsulation
    other classes need a way to read them
    but they can't directly access private variables

    place the symbol use setter

    returning the symbol character
    */

    private final int row;
    private final int col;

    private Symbol symbol;

    public Cell(int row,int col)
    {
        this.row=row;
        this.col=col;
        this.symbol=Symbol.EMPTY;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public Symbol getSymbol(){
        return symbol;
    }

    public void setSymbol(Symbol symbol)
    {
        this.symbol=symbol;
    }

    public boolean isEmpty(){
        return symbol==Symbol.EMPTY;
    }

    public void clear(){
        this.symbol=Symbol.EMPTY;
    }

    public String toString(){
        return String.valueOf(symbol.getChar());
    }
}
