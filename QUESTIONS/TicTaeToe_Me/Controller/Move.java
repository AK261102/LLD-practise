package QUESTIONS.TicTaeToe_Me.Controller;

import QUESTIONS.TicTaeToe_Me.models.Board;
import QUESTIONS.TicTaeToe_Me.models.Player;

/**
 * Move class handles making moves on the board.
 *
 * LLD Principle: Single Responsibility
 * - This class only handles the logic of making a move
 * - It delegates to Board for actual placement
 */
public class Move {

    /**
     * Make a move for the given player at the specified position
     *
     * @param board  The game board
     * @param row    Row index (0-based)
     * @param col    Column index (0-based)
     * @param player The player making the move
     * @return true if move was successful, false otherwise
     */
    public static boolean makeMove(Board board, int row, int col, Player player) {
        // Delegate to board's placeSymbol method
        // Board handles validation (bounds check, empty cell check)
        return board.placeSymbol(row, col, player.getSymbol());
    }
}
