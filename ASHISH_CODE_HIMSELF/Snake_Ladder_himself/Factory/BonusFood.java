package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Factory;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.FoodType;

public class BonusFood extends Food {
    public BonusFood(Position pos)
    {
        super(pos,50,FoodType.BONUS);
    }
    @Override
      public MovementStrategy getMovementEffect() {
        return null;  // no movement change
    }
     @Override
    public int getGrowth() { return 3; }  // grow by 3
}
