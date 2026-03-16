package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Factory;

import java.util.Random;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Board;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.FoodType;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;

public class FoodFactory {
    private Random random = new Random();

    public Food createFactory(set<Position> occupiedCells)
    {
        Board board=Board.getInstance();
        Position pos = findEmptyPosition(board,occupiedCells);
        FoodType type = rollFoodType();

        switch (type){
            case BONUS: return new BonusFood(pos);
            case SPECIAL: return new SpecialFood(pos);
            default: return new NormalFood(pos);
        }
    }

    private FoodType rollFoodType(){
        int roll = random.nextInt(100);
        if(roll<70)
            return FoodType.NORMAL;
        if(roll<90)
            return FoodType.BONUS;
        return FoodType.SPECIAL;
    }

    private Position findEmptyPosition(Board board, Set<Position> occupied)
    {
        Position pos;
        do{

        }
        return pos;
    }
}
