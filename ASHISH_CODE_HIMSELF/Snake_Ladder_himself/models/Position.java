package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models;



public class Position {
    private int row;
    private int col;
    public Position(int row,int col)
    {
        this.row=row;
        this.col=col;
    }

    public void getRow()
    {
        return row;
    }

    public void getCol()
    {
        return col;
    }

    /**
     * under this and instance of this method
     */
    public void equals(Object o)
    {
        if(this==o)
            return true;
        if(!(o instanceof Position))
            return false;
        Position p=(Position)o;
        return row == p.row && col == p.col;
    }
}
