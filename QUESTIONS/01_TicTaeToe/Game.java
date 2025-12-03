import java.util.Scanner;

/**
 * this java class main work is to
 * intialize players and board
 * manage turns (who plays next)
 * check for winner after each moves
 * check for a draw
 * handle game flow
 * 
 * 
 * this class uses other classes (board,player)
 * it does not know how they internally work that's encapsulation
*/
public class Game{
    // attributes
    public Board board;
    public Player p1;
    public Player p2;
    public Player currentPlayer;
    private boolean gameOver;
    private Player winner;
    
    // constructor
    public Game(Player p1,Player p2,Board board)
    {
        this.p1=p1;
        this.p2=p2;
        this.board=board;
        this.currentPlayer=p1;
        this.gameOver=false;
        this.winner=null;
    }

    //default constructor for 3x3 board
    public Game(Player p1,Player p2)
    {
        this(p1, p2, new Board(3));
    }

    // main game loop

    public void play()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("\n🎮 TIC-TAC-TOE GAME STARTED! 🎮");
        System.out.println(p1.getName() + " (X) vs " + p2.getName() + " (O)");
        System.out.println("Enter moves as: row,col (0-indexed)\n");
        
        while(!gameOver)
        {
            board.printBoard();

            System.out.println(currentPlayer.getName() +"'s turn" + currentPlayer.getSymbols() +" his symbols");

            String input = sc.nextLine().trim();
            int row,col;
            try{
                String[] parts=input.split(",");
                row =Integer.parseInt(parts[0].trim());
                col=Integer.parseInt(parts[1].trim());
            }
            catch(Exception e)
            {
                System.out.println("Input is invalid");
                continue;
            }

            boolean moveSuccess=board.makeMove(row,col,currentPlayer.getSymbols());

            if(!moveSuccess)
            {
                System.out.println("Invalid move");
                continue;
            }

            if(checkWinner(row,col,currentPlayer.getSymbols()))
            {
                gameOver=true;
                winner=currentPlayer;
                break;
            }
            if(board.isFull())
            {
                gameOver=true;
                break;
            }
            switchPlayer();
        }
        board.printBoard();
        if(winner!=null)
        {
            System.out.println("and winner is: "+winner.getName());
        }
        else
        {
            System.out.println("It's a draw");
        }
    }

    public void switchPlayer()
    {
        if(currentPlayer==p1)
            currentPlayer=p2;
        else
            currentPlayer=p1;
    }

    /**
     * checking how is the winner
     * we check
     * :row where last move was made
     * :col where last move was made
     * main diagonal 
     * anti diagonal
     */

    public boolean checkWinner(int lastRow,int lastCol, Symbols symbol)
    {
        int size=board.getBoardSize();
        if(checkLine(lastRow,0,0,1,symbol))
            return true;
        if(checkLine(0,lastCol,1,0,symbol))
            return true;
        if(lastCol==lastRow)
        {
            if(checkLine(0,0,1,1,symbol))
                return true;
        }

          // Check anti-diagonal (only if last move was on anti-diagonal)
        if (lastRow + lastCol == size - 1) {
            if (checkLine(0, size - 1, 1, -1, symbol)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Generic line checker
     *
     * startRow, startCol = where to start checking
     * rowDelta, colDelta = direction to move
     *
     * Examples:
     * - Row: startRow=r, startCol=0, rowDelta=0, colDelta=1
     * - Column: startRow=0, startCol=c, rowDelta=1, colDelta=0
     * - Main Diagonal: startRow=0, startCol=0, rowDelta=1, colDelta=1
     * - Anti-Diagonal: startRow=0, startCol=n-1, rowDelta=1, colDelta=-1
     */
    private boolean checkLine(int startRow, int startCol, int rowDelta, int colDelta, Symbols symbol) {
        int size = board.getBoardSize();

        for (int i = 0; i < size; i++) {
            int row = startRow + (i * rowDelta);
            int col = startCol + (i * colDelta);

            if (board.getSymbolsAt(row, col) != symbol) {
                return false;  // Found different symbol, not a win
            }
        }
        return true;  // All symbols matched!
    }
}