package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.service;

import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Board;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Move;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Player;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.WinningStrategy.WinningStrategy;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.GameStatus;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.Symbols;

public class GameService {
    private Board board;
    private List<Move> moveHistory;
    private List<Player> player;
    private int current_idx;
    private List<WinningStrategy> winningStrategy;
    private GameStatus status;

    public GameService(Board board,List<Move> moveHistory,List<Player> player,int current_idx,List<WinningStrategy> winningStrategy,GameStatus status)
    {
        this.board=board;
        this.player=player;
        this.winningStrategy=winningStrategy;
        this.current_idx=0;
        this.status=status.IN_PROGRESS;
        this.moveHistory=moveHistory;
    }

    public GameStatus makeMove(int row,int col)
    {
        // valid game moves
        validateMoves(row, col);

        // place pices
        Player current=Player.get(current_idx);
        // board ka cell mila then set Symbols kiya hu
        board.getCell(row,col).setSymbols(current.getSymbols)
        // moves ko history mein add kiya hu
        moveHistory.add(new Move(row, col, current));
        // check win kiya hu
        if(checkWin(row, col, current.getSymbols()))
        {
            GameStatus gamestatus =(current.getSymbols==Symbols.X) ? status.X_WIN:status.O_WIN;
            return gamestatus;
        }
        //
        if(board.isFull())
        {
            gamestatus=GameStatus.DRAW;
            return gamestatus;
        }

        current_idx=(current_idx+1)%player.size();
        return gamestatus;
    }
    public boolean validateMoves(int row,int col)
    {
        if(row>=board.getSize() && col>=board.getSize())
        {
            return false;
        }
        if(board.isFull())
        {
            return false;
        }
        return true;

    }

    public boolean checkWin(int row,int col,Symbols symbols)
    {
        for(WinningStrategy strategy:winningStrategy)
        {
            if(strategy.checkWin(board, row, col, symbols)){
                return true;
            }
        }
        return false;
    }
    public GameStatus getGameStatus()
    {
        return status;
    }
}
