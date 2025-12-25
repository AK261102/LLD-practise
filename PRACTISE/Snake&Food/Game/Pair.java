package PRACTISE.Snake&Food.Game;


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

public class Pair {
    private int row;
    private int col;

    public Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        Pair other = (Pair) obj;
        return this.row == other.row && this.col == other.col;
    }
}
