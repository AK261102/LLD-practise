package PRACTISE.Chess.Strategies;

import PRACTISE.Chess.Game.Cell;
import PRACTISE.Tic_Tac_Toe.Board;

public class RookMovementStrategy implements MovementStrategy {
    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell){
        int startRow=startCell.getRow();
        int endRow=endCell.getRow();
        int startCol=startCell.getCol();
        int endCol=endCell.getCol();

        boolean isHori=(startRow==endRow && startCol!=endCol);
        boolean isVert=(startCol==endCol && startRow!=endRow);
          
        if (!isHorizontal && !isVertical) {
            return false;  // Not a valid rook move
        }
        
        /*
         * Check if path is clear (no pieces in between)
         * 
         * Rook CANNOT jump over pieces!
         */
        if(isHori){
            int mincol;
            int maxcol;
            for(int col=mincol+1;col<maxcol;col++)
            {
                if(!board.getCell(startRow, col).isEmpty())
                    return false;
            }
            else
            {
                int minRow;
                int maxRow;
                for(int row=minRow+1;row<maxRow;row++)
                {
                    if(!board.getCell(row, col).isEmpty())
                        return false;
                }
            }
        }
        return true;
    }
}
