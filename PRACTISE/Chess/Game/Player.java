package PRACTISE.Chess.Game;

public class Player {
    private String name;
    private boolean isWhiteSide;

    public Player(String name,boolean isWhite)
    {
        this.name=name;
        this.isWhiteSide=isWhite;
    }
    // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public String getName() {
        return name;
    }
    
    public boolean isWhiteSide() {
        return isWhiteSide;
    }
    
    @Override
    public String toString() {
        return name + " (" + (isWhiteSide ? "White" : "Black") + ")";
    }
}
