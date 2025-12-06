package QUESTIONS.TicTaeToe_Me.Strategy;

import QUESTIONS.TicTaeToe_Me.models.Board;
import QUESTIONS.TicTaeToe_Me.models.GameState;
import QUESTIONS.TicTaeToe_Me.models.Symbols;

import java.util.ArrayList;
import java.util.List;

/**
 * GameChecker uses Strategy Pattern to check game state.
 *
 * LLD Principles:
 * - Strategy Pattern: Uses different strategies to check win conditions
 * - Open/Closed Principle: Can add new win strategies without modifying this class
 * - Dependency Injection: Strategies are injected via constructor or method
 */
public class GameChecker {
    private List<WinStrategy> winStrategies;

    public GameChecker() {
        // Initialize with all win checking strategies
        winStrategies = new ArrayList<>();
        winStrategies.add(new RowWin());
        winStrategies.add(new ColumnWin());
        winStrategies.add(new DiagonalWin());
    }

    /**
     * Add a custom win strategy (extensibility)
     */
    public void addStrategy(WinStrategy strategy) {
        winStrategies.add(strategy);
    }

    /**
     * Check if a specific symbol has won using all strategies
     */
    public boolean checkWin(Board board, Symbols symbol) {
        for (WinStrategy strategy : winStrategies) {
            if (strategy.checkWin(board, symbol)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get the current game state
     */
    public GameState getGameState(Board board) {
        // Check if X wins
        if (checkWin(board, Symbols.X)) {
            return GameState.X_WINS;
        }

        // Check if O wins
        if (checkWin(board, Symbols.O)) {
            return GameState.O_WINS;
        }

        // Check for draw (board is full but no winner)
        if (board.isFull()) {
            return GameState.DRAW;
        }

        // Game is still in progress
        return GameState.IN_PROGRESS;
    }
}
