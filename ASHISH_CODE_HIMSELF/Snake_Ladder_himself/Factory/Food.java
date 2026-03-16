package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Factory;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.FoodType;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;

public abstract class Food {
    private Position position;
    private int points;
    private FoodType foodType;

    public Food(Position position, int points, FoodType type) {
        this.position = position;
        this.points = points;
        this.type = type;
    }
    public Position getPosition() { return position; }
    public int getPoints()        { return points; }
    public FoodType getType()     { return type; }

    public abstract MovementStrategy getMovementEffect();
    
    public abstract int getGrowth();
}
