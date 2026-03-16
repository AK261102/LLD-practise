package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Strategy;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Direction;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;

public class BonusStrategy implements MoveStrategy {
    @Override
    public Position move(Position pos,Direction direction)
    {
        return new Position(pos.getRow()+2*direction.getDrow(), pos.getCol()+2*direction.getDcol());
    }
}
