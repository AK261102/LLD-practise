package QUESTIONS.TicTaeToe_Me.Controller;

import QUESTIONS.TicTaeToe_Me.models.Board;

public class Move {
    public static void makeMove(int i,int j,Player p)
    {
        /*
        who so ever ,turn it will be 
        we will take the input i ,j and which player is making the changes,because the player changes is associated with player's symbols
        means that 1st player means X and 2nd player means O

        */
       if(p.Symbols=='X')
       {
        Board[i][j]='X';
       }
       else if(p.Symbols=='O')
       {
        Board[i][j]='O';
       }
       // after making the move, i will check it is winning condition or
       if(Board.checkWin()==true);
       // then that player is the winner
       else if(Board.checkDraw()==true)
        // return draw
       else if(Board.continueGame()==true)
        //next turn next player chale
    }
}
