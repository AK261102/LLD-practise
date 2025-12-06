package QUESTIONS.TicTaeToe_Me.Controller;

import java.util.Scanner;

import QUESTIONS.TicTaeToe_Me.Strategy.GameChecker;
import QUESTIONS.TicTaeToe_Me.models.Board;
import QUESTIONS.TicTaeToe_Me.models.GameState;
import QUESTIONS.TicTaeToe_Me.models.Player;

/**
 * LetsPlay is the main game controller.
 *
 * LLD Principles:
 * - Single Responsibility: Manages game flow (turn taking, input handling)
 * - Dependency Injection: Receives Board, Players, and GameChecker as dependencies
 * - Separation of Concerns: Game logic is separate from win checking (Strategy)
 *
 * Responsibilities:
 * 1. Manage player turns
 * 2. Handle user input
 * 3. Coordinate between Board and GameChecker
 * 4. Display game state
 */
public class LetsPlay {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private GameChecker gameChecker;
    private Scanner scanner;

    public LetsPlay(Player player1, Player player2, int boardSize) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board(boardSize);
        this.gameChecker = new GameChecker();
        this.scanner = new Scanner(System.in);
        this.currentPlayer = player1; // Player 1 starts first
    }

    /**
     * Main game loop
     */
    public void startGame() {
        System.out.println("\n=== TIC TAC TOE ===");
        System.out.println(player1.getName() + " is " + player1.getSymbol());
        System.out.println(player2.getName() + " is " + player2.getSymbol());
        System.out.println("Enter row and column (0-" + (board.getSize() - 1) + ") separated by space.");
        System.out.println("Example: 0 1 means row 0, column 1\n");

        GameState state = GameState.IN_PROGRESS;

        while (state == GameState.IN_PROGRESS) {
            // Display current board
            board.displayBoard();

            // Current player's turn
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");

            // Get valid move from player
            boolean validMove = false;
            while (!validMove) {
                int[] position = getPlayerInput();
                if (position != null) {
                    validMove = Move.makeMove(board, position[0], position[1], currentPlayer);
                }
            }

            // Check game state after move
            state = gameChecker.getGameState(board);

            // If game is still in progress, switch player
            if (state == GameState.IN_PROGRESS) {
                switchPlayer();
            }
        }

        // Game over - display final board and result
        board.displayBoard();
        announceResult(state);
    }

    /**
     * Get row and column input from player
     */
    private int[] getPlayerInput() {
        System.out.print("Enter row and column: ");
        try {
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+");

            if (parts.length != 2) {
                System.out.println("Please enter exactly 2 numbers separated by space!");
                return null;
            }

            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);
            return new int[]{row, col};

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only.");
            return null;
        }
    }

    /**
     * Switch to the other player
     */
    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    /**
     * Announce the game result
     */
    private void announceResult(GameState state) {
        System.out.println("\n=== GAME OVER ===");
        switch (state) {
            case X_WINS:
                Player winner = (player1.getSymbol().toString().equals("X")) ? player1 : player2;
                System.out.println(winner.getName() + " WINS!");
                break;
            case O_WINS:
                winner = (player1.getSymbol().toString().equals("O")) ? player1 : player2;
                System.out.println(winner.getName() + " WINS!");
                break;
            case DRAW:
                System.out.println("It's a DRAW!");
                break;
            default:
                break;
        }
    }
}
