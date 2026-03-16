package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Factory;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Strategy.MoveStrategy;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.FoodType;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;

public class NormalFood extends Food {
    public NormalFood(Position pos)
    {
        super(pos,10,FoodType.NORMAL);
    }
    @Override
    public MoveStrategy getMovementEffect()
    {
        return null;
    }
     @Override
    public int getGrowth() { return 1; }  // grow by 1
}
