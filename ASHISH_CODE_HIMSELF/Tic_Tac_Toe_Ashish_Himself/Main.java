package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself;

import java.util.List;
import java.util.Scanner;

import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Board;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities.Player;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.WinningStrategy.ColumnStrategy;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.WinningStrategy.DiagonalStrategy;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.WinningStrategy.RowStrategy;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.WinningStrategy.WinningStrategy;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.GameStatus;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.Symbols;
import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.service.GameService;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(3);
        List<Player> players = List.of(new Player("Ashish",Symbols.O),)new Player("Ayush", Symbols.X);

        List<WinningStrategy> strategy = List.of(new RowStrategy(),new ColumnStrategy(),new DiagonalStrategy());

        GameService game= new GameService(board, players, strategy);

        Scanner scanner = new Scanner(System.in);

        while(GameStatus.IN_PROGRESS == game.getGameStatus)
        {
            board.printBoard();
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            try{
                game.makeMove(row, col);
            }
            catch{
                // invalid move
            }

        }

 System.out.println("Result: " + game.getGameStatus());
    }
}
