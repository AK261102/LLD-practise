package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models;

public class Board {
    private static Board instance;

    public Board(int row,int col)
    {
        this.row=row;
        this.col=col;
    }

    private int row;
    private int col;

    public static Board getInstance()
    {
        if(instance==null)
        {
            instance=new Board(row,col);
        }
        return instance;
    }

    public boolean getValidPositionCheck(Position pos)
    {
        return pos.getCol()<=col && pos.getRow()<=row && pos.getCol()>=0 && pos.getRow();;
    }

    public int getRows() { return rows; }
    public int getCols() { return cols; }
    
}
