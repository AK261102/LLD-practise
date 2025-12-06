package QUESTIONS.TicTaeToe_Me.Strategy;

import QUESTIONS.TicTaeToe_Me.models.Board;
import QUESTIONS.TicTaeToe_Me.models.Symbols;

/**
 * Strategy to check for column-based winning condition.
 *
 * LLD Principle: Single Responsibility
 * - This class only checks columns for winning condition
 */
public class ColumnWin implements WinStrategy {

    @Override
    public boolean checkWin(Board board, Symbols symbol) {
        int size = board.getSize();

        // Check each column
        for (int col = 0; col < size; col++) {
            boolean colWin = true;
            for (int row = 0; row < size; row++) {
                if (board.getSymbolAt(row, col) != symbol) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) {
                return true;
            }
        }
        return false;
    }
}
