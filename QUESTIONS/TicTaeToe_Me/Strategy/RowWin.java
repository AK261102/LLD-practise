package QUESTIONS.TicTaeToe_Me.Strategy;

import QUESTIONS.TicTaeToe_Me.models.Board;
import QUESTIONS.TicTaeToe_Me.models.Symbols;

/**
 * Strategy to check for row-based winning condition.
 *
 * LLD Principle: Single Responsibility
 * - This class only checks rows for winning condition
 */
public class RowWin implements WinStrategy {

    @Override
    public boolean checkWin(Board board, Symbols symbol) {
        int size = board.getSize();

        // Check each row
        for (int row = 0; row < size; row++) {
            boolean rowWin = true;
            for (int col = 0; col < size; col++) {
                if (board.getSymbolAt(row, col) != symbol) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) {
                return true;
            }
        }
        return false;
    }
}
