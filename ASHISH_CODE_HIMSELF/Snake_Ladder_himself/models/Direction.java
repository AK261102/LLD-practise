package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models;

public enum Direction {
    UP(0,1),DOWN(0,-1),LEFT(-1,0),RIGHT(1,0);

    private int drow;
    private int dcol;
    Direction(int drow,int dcol)
    {
        this.drow=drow;
        this.dcol=dcol;
    }

    public void getDrow()
    {
        return drow;
    }

    public void getDcol()
    {
        return dcol;
    }
}
