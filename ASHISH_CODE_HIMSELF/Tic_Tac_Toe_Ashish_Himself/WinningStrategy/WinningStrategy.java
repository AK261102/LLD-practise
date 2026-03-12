package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.WinningStrategy;

import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Board;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Player;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.Symbols;

public interface WinningStrategy {
    boolean checkWin(Board board,int row,int col,Symbols symbols);
}
