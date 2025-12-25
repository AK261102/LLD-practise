package PRACTISE.Chess.Game;

public class Cell {
    private final int row,
    private final int col;

    private Piece piece;

    public Cell(int row,int col,Piece piece)
    {
        this.row=row;
        this.col=col;
        this.piece=piece;
    }

    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public Piece getPiece()
    {
        return piece;
    }

    public void setPiece(Piece piece)
    {
        this.piece=piece;
    }

     /**
     * Check if cell is empty (no piece)
     */
    public boolean isEmpty() {
        return piece == null;
    }
    
    /**
     * Check if cell has a piece of given color
     */
    public boolean hasPieceOfColor(boolean isWhite) {
        return piece != null && piece.isWhite() == isWhite;
    }
    
    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
