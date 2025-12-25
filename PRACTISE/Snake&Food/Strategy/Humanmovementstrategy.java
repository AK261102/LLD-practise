package PRACTISE.Snake

import PRACTISE.Chess.Strategies.MovementStrategy;

&Food.Strategy;

public class Humanmovementstrategy implements MovementStrategy {
    @Override
    public Pair getNextPosition(Pair currentHead, String direction)
    {
        int row=currentHead.getRow();
        int col=currentHead.getCol();

        switch (direction) {
            case "U":
                return new Pair(row-1,co);       
                break;
        
            default:
                break;
        }
    }
}
