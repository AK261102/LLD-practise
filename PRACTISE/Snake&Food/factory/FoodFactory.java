package PRACTISE.Snake&Food.factory;


/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 4: FOOD CLASSES + FACTORY
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ FACTORY PATTERN ⭐
 * 
 * WHY FACTORY?
 * ────────────
 * Different food types give different points:
 *   - Normal food: 1 point
 *   - Bonus food: 3 points
 *   - (Future: Poison food: -1 point?)
 * 
 * Factory centralizes food creation:
 *   FoodFactory.createFood("bonus", position)
 * 
 * 
 * CLASS HIERARCHY:
 * ────────────────
 *         ┌─────────────────┐
 *         │   FoodItem      │
 *         │   (Abstract)    │
 *         └────────┬────────┘
 *                  │
 *         ┌────────┴────────┐
 *         ▼                 ▼
 *   ┌───────────┐     ┌───────────┐
 *   │ NormalFood│     │ BonusFood │
 *   │ (1 point) │     │ (3 points)│
 *   └───────────┘     └───────────┘
 */

// ═══════════════════════════════════════════════════════════════════
// ABSTRACT BASE CLASS
// ═══════════════════════════════════════════════════════════════════


abstract class FoodItem{
    protected int row;
    protected int col;
    protected int points;

    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public int getPoints()
    {
        return points;
    }

    @Override
    public String toString()
    {

    }
}

class NormalFood extends FoodItem{
    public NormalFood(int row,int col)
    {
        super(row,col);
        this.points=1;
    }
}

class BonusFood extends FoodItem{
    public BonusFood(int row,int col){
        super(row,col);
        this.points=3;
    }
}
public class FoodFactory {
    

    public static FoodItem createFood(int[] position, String type)
    {
        int row = position[0];
        int col = position[1];
        
        switch(type.toLowerCase()){
            case "bonus":
                return new BonusFood(row,col);
            case "normal":
                return new NormalFood(row, col);    
        }
    }

    public static FoodItem createFood(int[] position){
        return createFood(position,"normal");
    }

public class FoodFactory{
    public static FoodItem(int[] position, String type)
    {
        int row=position[0];
        int col=position[0];
        
        switch (type.toLowerCase())
        {
            case "bonus":
                return new BonusFood(row,col);
                    
        }
    }
}
}
