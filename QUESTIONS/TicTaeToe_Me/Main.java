package QUESTIONS.TicTaeToe_Me;

import java.util.Scanner;

import QUESTIONS.TicTaeToe_Me.Controller.LetsPlay;
import QUESTIONS.TicTaeToe_Me.models.Player;
import QUESTIONS.TicTaeToe_Me.models.Symbols;

/**
 * Main class - Entry point for the TicTacToe game.
 *
 * LLD Principle: This is the client code that creates objects
 * and wires them together. It should be thin and delegate to other classes.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("========================\n");

        // Get player names
        System.out.print("Enter Player 1 name (X): ");
        String name1 = scanner.nextLine().trim();
        if (name1.isEmpty()) name1 = "Player1";

        System.out.print("Enter Player 2 name (O): ");
        String name2 = scanner.nextLine().trim();
        if (name2.isEmpty()) name2 = "Player2";

        // Create players
        Player player1 = new Player(name1, Symbols.X);
        Player player2 = new Player(name2, Symbols.O);

        // Get board size (default 3x3)
        System.out.print("Enter board size (default 3): ");
        String sizeInput = scanner.nextLine().trim();
        int boardSize = 3;
        if (!sizeInput.isEmpty()) {
            try {
                boardSize = Integer.parseInt(sizeInput);
                if (boardSize < 3) {
                    System.out.println("Board size must be at least 3. Using default size 3.");
                    boardSize = 3;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Using default size 3.");
            }
        }

        // Create game controller and start the game
        LetsPlay game = new LetsPlay(player1, player2, boardSize);
        game.startGame();

        System.out.println("\nThank you for playing!");
        scanner.close();
    }
}
