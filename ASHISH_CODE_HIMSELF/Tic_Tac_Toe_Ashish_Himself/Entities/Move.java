package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities;

public class Move {
    private int row;
    private int col;
    private Player player;

    public Move(int row,int col,Player player)
    {
        this.row=row;
        this.col=col;
        this.player=player;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public Player getPlayer() { return player; }
}
