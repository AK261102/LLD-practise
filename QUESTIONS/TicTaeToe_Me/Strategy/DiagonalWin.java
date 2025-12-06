package QUESTIONS.TicTaeToe_Me.Strategy;

import QUESTIONS.TicTaeToe_Me.models.Board;
import QUESTIONS.TicTaeToe_Me.models.Symbols;

/**
 * Strategy to check for diagonal-based winning condition.
 * Checks both main diagonal (top-left to bottom-right)
 * and anti-diagonal (top-right to bottom-left).
 *
 * LLD Principle: Single Responsibility
 * - This class only checks diagonals for winning condition
 */
public class DiagonalWin implements WinStrategy {

    @Override
    public boolean checkWin(Board board, Symbols symbol) {
        int size = board.getSize();

        // Check main diagonal (top-left to bottom-right)
        boolean mainDiagonalWin = true;
        for (int i = 0; i < size; i++) {
            if (board.getSymbolAt(i, i) != symbol) {
                mainDiagonalWin = false;
                break;
            }
        }
        if (mainDiagonalWin) {
            return true;
        }

        // Check anti-diagonal (top-right to bottom-left)
        boolean antiDiagonalWin = true;
        for (int i = 0; i < size; i++) {
            if (board.getSymbolAt(i, size - 1 - i) != symbol) {
                antiDiagonalWin = false;
                break;
            }
        }
        return antiDiagonalWin;
    }
}
