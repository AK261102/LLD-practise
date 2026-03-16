package ASHISH_CODE_HIMSELF.Snake_Ladder_himself;

import java.util.Random;

import ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Service.Game;
import PRACTISE.Elevator_System.core.Direction;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(20,20);

        Random rand = new Random(42);

        Direction[] dirs = Direction.values();

        for(int i=1;i<=25;i++)
        {
            if(i%3==0)
                game.changeDirection(dirs[rand.nextInt(dirs.length)]);
            game.moveTick();
        }
    }
}
