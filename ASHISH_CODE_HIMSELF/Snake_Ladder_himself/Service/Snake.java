package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Service;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Strategy.MoveStrategy;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Strategy.NormalStrategy;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Direction;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;



public class Snake {
    private LinkedList<Position> body;
    private Direction direction;
    private MoveStrategy movementStrategy;
    private int pendingGrowth;

    public Snake(Position startPos)
    {
        this.body=new LinkedList<>();
        this.body.addFirst(startPos);
        this.direction=Direction.RIGHT;
        this.movementStrategy=new NormalStrategy();
        this.pendingGrowth=0;
    }

    public void move()
    {
        Position newHead = movementStrategy.move(getHead(),direction);
        body.addFirst(newHead);
        if(pendingGrowth>0)
            pendingGrowth--;
        else
            body.removeLast();
    }

    /**
     * WHY check for 180° reversal?
     * If snake is going RIGHT and you press LEFT, it would
     * reverse into itself → instant death. That's a bad UX.
     * So we silently ignore opposite-direction inputs.
     */

    public void setDirection(Direction dir)
    {
        if(dir.getDrow()+direction.getDrow() ==0 && dir.getDcol()+direction.getDcol())
            return;
        this.direction=dir;
    }

    public void setMovementStrategy(MoveStrategy strategy)
    {
        this.movementStrategy=strategy;
    }

     public Position getHead() { return body.getFirst(); }

     // WHY return Set? → FoodFactory needs to check "is this cell occupied?"
    // HashSet gives O(1) lookup via Position.equals() + hashCode()
    public Set<Position> getOccupiedCells() {
        return new HashSet<>(body);
    }

    public boolean hasCollidedWithSelf(){
        Position head=getHead();
        for(int i=1;i<body.size();i++)
        {
            if(body.get(i).equals(head))
                return true;
        }
        return false;
    }
 
}
