package PRACTISE.Tic_Tac_Toe;


Game · JAVA
Copy

/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║                      STEP 6: GAME CLASS                          ║
 * ╠══════════════════════════════════════════════════════════════════╣
 * ║                                                                  ║
 * ║  Game = The CONTROLLER that runs everything                     ║
 * ║                                                                  ║
 * ║  Think of it as the "referee" of the game:                       ║
 * ║  ├── Creates the board                                           ║
 * ║  ├── Manages player turns                                        ║
 * ║  ├── Validates moves                                             ║
 * ║  ├── Checks for winner/draw                                      ║
 * ║  └── Announces the result                                        ║
 * ║                                                                  ║
 * ║  GAME FLOW:                                                      ║
 * ║                                                                  ║
 * ║    START                                                         ║
 * ║      │                                                           ║
 * ║      ▼                                                           ║
 * ║  ┌─────────┐                                                     ║
 * ║  │Show     │◄─────────────────┐                                  ║
 * ║  │Board    │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │                       │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐                  │                                  ║
 * ║  │Get Move │                  │                                  ║
 * ║  │from     │                  │                                  ║
 * ║  │Player   │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │                       │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐   Invalid        │                                  ║
 * ║  │Validate │───────────────────                                  ║
 * ║  │Move     │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │ Valid                 │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐                  │                                  ║
 * ║  │Make     │                  │                                  ║
 * ║  │Move     │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │                       │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐   No             │                                  ║
 * ║  │Winner?  │──────────────────┤                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │ Yes                   │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐   No             │                                  ║
 * ║  │Draw?    │──► Switch Player─┘                                  ║
 * ║  └────┬────┘                                                     ║
 * ║       │ Yes                                                      ║
 * ║       ▼                                                          ║
 * ║     END                                                          ║
 * ║                                                                  ║
 * ╚══════════════════════════════════════════════════════════════════╝
 */

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private GameStatus status;
    private Player winner;

    /**
     * we are making a game loop and
     * continues while game is IN_PROGRESS
     * stops when someone winner or loses
     * 
     */

    public Game(Player player1,Player player2,int boardSize)
    {
        this.board= new Board(boardSize);
        this.player1=player1;
        this.player2=player2;
        this.currentPlayer=currentPlayer;
        this.status=GameStatus.IN_PROGRESS;
        this.winner=null;
    }

    public Game(Player player1,Player player2)
    {
        this(player1,player2,3);
    }

    public void start()
    {
        printWelcome();


        while(GameStatus.IN_PROGRESS==status)
        {
            board.print();

            int[] move = currentPlayer.makeMoves();
            int row = move[0];
            int col = move[1];
            if(!board.isValidMove(row, col))
            {
                System.out.println("invalid move please try again");
                continue;
            }

            board.makeMove(row, col, currentPlayer.getSymbol());

            if(board.checkWinner(row, col, currentPlayer.getSymbol()))
            {
                status=GameStatus.WIN;
                winner=currentPlayer;
                break;
            }

            if(board.isFull())
            {
                status = GameStatus.DRAW;
                break;
            }

            switchPlayer();
        }
        board.print();
        printResult();
    }

    private void switchPlayer()
    {
        if(currentPlayer==player1)
            currentPlayer=player2;
        else
            currentPlayer=player1;
    }

     /**
     * Print welcome message
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      🎮 TIC-TAC-TOE GAME 🎮          ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  " + player1.getName() + " (X) vs " + player2.getName() + " (O)");
        System.out.println("║                                      ║");
        System.out.println("║  Enter moves as: row,col             ║");
        System.out.println("║  Example: 0,0 for top-left           ║");
        System.out.println("║           1,1 for center             ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
    
    /**
     * Print game result
     */
    private void printResult() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║            GAME OVER!                ║");
        System.out.println("╠══════════════════════════════════════╣");
        
        if (status == GameStatus.WIN) {
            System.out.println("║  🎉 " + winner.getName() + " WINS! 🎉");
        } else {
            System.out.println("║  🤝 It's a DRAW! 🤝                  ║");
        }
        
        System.out.println("╚══════════════════════════════════════╝");
    }

    public GameStatus getStatus(){
        return status;
    }
    public Player getWinner()
    {
        return winner;
    }
    public Player getCurrentPlayer()
    {
        return currentPlayer;
    }
    public Board getBoard()
    {
        return board;
    }
}
