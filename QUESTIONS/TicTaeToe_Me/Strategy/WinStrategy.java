package QUESTIONS.TicTaeToe_Me.Strategy;

import QUESTIONS.TicTaeToe_Me.models.Board;
import QUESTIONS.TicTaeToe_Me.models.Symbols;

/**
 * Strategy Interface for checking win conditions.
 *
 * LLD Principle: Strategy Pattern
 * - Defines a family of algorithms (different win checking methods)
 * - Encapsulates each algorithm in a separate class
 * - Makes them interchangeable
 *
 * Open/Closed Principle:
 * - Open for extension (can add new win strategies like anti-diagonal)
 * - Closed for modification (existing code doesn't change)
 */
public interface WinStrategy {
    /**
     * Check if the given symbol has a winning condition
     * @param board The game board
     * @param symbol The symbol to check for winning
     * @return true if the symbol has won according to this strategy
     */
    boolean checkWin(Board board, Symbols symbol);
}
