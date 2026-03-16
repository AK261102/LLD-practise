package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Strategy;

import ASHISH_CODE_HIMSELF.Elevator_System.Enums.Direction;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;

public interface MoveStrategy {
    public Position move(Position currentHead, Direction direction);
    String getName();
}
