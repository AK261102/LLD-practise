package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Strategy;


import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Direction;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;

public class NormalStrategy implements MoveStrategy{
    @Override
    public Position move(Position pos,Direction direction)
    {
        return Position(pos.getRow()+direction.getDrow(),pos.getCol()+direction.getDcol());
    }
}
