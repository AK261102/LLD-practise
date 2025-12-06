package QUESTIONS.TicTaeToe_Me.models;

/**
 * Player class represents a player in the TicTacToe game.
 * Each player has a name and an associated symbol (X or O).
 *
 * LLD Principle: Single Responsibility - This class only handles player data.
 */
public class Player {
    private String name;
    private Symbols symbol;

    public Player(String name, Symbols symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // Getters - Encapsulation: provide controlled access to private fields
    public String getName() {
        return name;
    }

    public Symbols getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name + " (" + symbol + ")";
    }
}
