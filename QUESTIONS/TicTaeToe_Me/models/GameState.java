package QUESTIONS.TicTaeToe_Me.models;

/**
 * Enum to represent the current state of the game.
 *
 * LLD Principle: Using enums for fixed states provides type safety
 * and makes the code more readable.
 */
public enum GameState {
    IN_PROGRESS,    // Game is still ongoing
    X_WINS,         // Player X has won
    O_WINS,         // Player O has won
    DRAW            // Board is full with no winner
}
