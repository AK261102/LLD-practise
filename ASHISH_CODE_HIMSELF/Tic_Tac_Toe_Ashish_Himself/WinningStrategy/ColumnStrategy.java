package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.WinningStrategy;

import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Board;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.Symbols;

import ASHISH_CODE_HIMSELF.*;


public class ColumnStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board,int row,int col,Symbols symbols)
    {
        for(int i=0;i<board.getSize();i++)
        {
            if(board.getCellSymbols(i, col)!=symbols)
            {
                return false;
            }
        }
        return true;
    }
}
