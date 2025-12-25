package PRACTISE.Snake

import java.util.Scanner;

&Food;

/**
 * ══════════════════════════════════════════════════════════════════
 *                      STEP 1: PAIR CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Pair = A coordinate on the game board (row, col)
 * 
 * Used for:
 *   - Snake head position
 *   - Snake body segments
 *   - Food positions
 * 
 *    col→  0   1   2   3   4
 *        ┌───┬───┬───┬───┬───┐
 *   row 0│   │   │   │   │   │
 *      ↓ ├───┼───┼───┼───┼───┤
 *      1 │   │(1,1)│   │   │   │  ← Pair(1, 1)
 *        ├───┼───┼───┼───┼───┤
 *      2 │   │   │   │(2,3)│   │  ← Pair(2, 3)
 *        └───┴───┴───┴───┴───┘
 * 
 * 
 * IMPORTANT: Must override equals() and hashCode()!
 * ─────────────────────────────────────────────────
 * 
 * WHY?
 * We use Pair as KEY in HashMap for O(1) collision detection.
 * HashMap uses equals() and hashCode() to find keys!
 * 
 * Without proper equals/hashCode:
 *   Pair p1 = new Pair(1, 2);
 *   Pair p2 = new Pair(1, 2);
 *   map.put(p1, true);
 *   map.containsKey(p2);  // FALSE! (should be TRUE)
 * 
 * With proper equals/hashCode:
 *   map.containsKey(p2);  // TRUE! ✓
 */

public class Main {

    int width=10;
    int height=10;
    int [][] foodPositions = {
        {3,5},
        {0,1},
    }
    Snakegame game = new SnakeGame(width,height,foodPositions);
    boolean game_is_running=true;
    while(game_is_running){
        game.printBoard();
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the coordinates");
        String str=sc.nextLine().trim();
        score = game.move(direction);
        if(score==-1)
            System.out.println("game is over")
        sc.close();
    }
}
