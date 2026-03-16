package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Service;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Factory.Food;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Factory.FoodFactory;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Observer.ScoreDisplay;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Observer.ScoreManager;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Observer.SoundNotifier;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Strategy.MoveStrategy;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Board;
import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.models.Position;
import PRACTISE.Parking_Alot.spots.parkingSpot;

public class Game {
    private Board board;
    private Snake snake;
    private FoodFactory foodFactory;
    private ScoreManager scoreManager;
    private Food currentFood;
    private boolean isRunning;
    private int speedBoostMovesLeft;

    public Game(int row,int col)
    {
        this.board= new Board(row, col);
        this.snake=new Snake(new Position(row/2, col/2));
        this.foodFactory=new FoodFactory();

        this.scoreManager = new ScoreManager();
        this.scoreManager.addObserver(new ScoreDisplay());
        this.scoreManager.addObserver(new SoundNotifier());

        this.currentFood = foodFactory.createFactory(snake.getOccupiedCells());
        this.isRunning=true;
    }

    public void moveTick()
    {
        if(isRunning)
            return;
        snake.move();
        Position head = snake.getHead();

        if(!board.isValidPosition(head))
        {
            return;
        }

        if(snake.hasCollidedWithSelf())
        {
            return;
        }

        if(head.equals(currentFood.getPosition())){
            eatFood(currentFood);
        }
    }

    public void eatFood(Food food)
    {
        System.out.println("\nAte " + food);

        snake.grow(food.getGrowth());

        scoreManager.addScore(food.getPoints(),food.getType());

        MoveStrategy effect = food.getMovementEffect();

        currentFood = foodFactory.createFood(snake.getOccupiedCells());
    }

     private void gameOver(String reason) {
        System.out.println("\n>>> GAME OVER: " + reason);
        System.out.println(">>> Final Score: " + scoreManager.getScore());
        isRunning = false;
    }
 
    // Public methods for input handling
    public void changeDirection(Direction dir) { snake.setDirection(dir); }
    public boolean isRunning()  { return isRunning; }
    public int getScore()       { return scoreManager.getScore(); }
    public Snake getSnake()     { return snake; }
    public Food getCurrentFood(){ return currentFood; }
}
