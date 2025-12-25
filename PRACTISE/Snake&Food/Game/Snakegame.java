package PRACTISE.Snake

import PRACTISE.Chess.Strategies.MovementStrategy;
import PRACTISE.Snake.Snake.Snake;

&Food.Game;

public class Snakegame {
    
    private GameBoard board;
    private Snake snake;
    private int[][] foodPositions;
    private int foodIndex;
    private int score;

    private MovementStrategy strate;

    public Snakegame(int width,int height,int[][] foodPositions){
        this.board = GameBoard.getInstance(width,height);
        this.snake=new Snake();
        this.foodPositions=foodPositions;
        this.foodIndex=0;
        this.score=1;

        this.strate=new Humanmovementstrategy();
    }

    public int move(String direction)
    {
        Pair currentHead = snake.getHead();
        Pair newHead = MovementStrategy.getNextPosition(currentHead,direction);
        int newRow = newHead.getRow();
        int newCol = newHead.getCol();

        boolean isWallCollision = !board.isValidPosition(newHead);

        boolean ateFood=false;
        if(foodIndex<foodPositions.length){
            int[] currentFood = foodPositions[foodIndex];
            ateFood=(newRow==currentFood[0]) && newCol==currentFood[1];
        }

        if(ateFood==true)
        {
            snake.grow(newHead);
            foodIndex++;
            score++:
        }
        else{
            snake.move(newHead);
        }
    }
}
