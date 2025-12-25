package PRACTISE.Snake&Food.Game;

/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 2: GAMEBOARD CLASS (SINGLETON)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ SINGLETON PATTERN ⭐
 * 
 * WHY SINGLETON?
 * ──────────────
 * - Only ONE game board should exist
 * - All components access SAME board
 * - Prevents accidental multiple boards
 * 
 * 
 * HOW IT WORKS:
 * ─────────────
 * 1. Private constructor (can't create from outside)
 * 2. Private static instance
 * 3. Public static getInstance() method
 * 
 * 
 * BOARD VISUALIZATION:
 * ────────────────────
 *    width = 10
 *    ┌───────────────────────────────────────┐
 *    │                                       │
 *    │                                       │
 *    │                                       │ height = 8
 *    │                                       │
 *    │                                       │
 *    └───────────────────────────────────────┘
 * 
 * 
 * singleton design 
 * 
 * private static instance
 * singleton : private constructor
 * private can't call from outside
 * use getInstance() instead
 */


public class GameBoard {
    
    private static GameBoard instance;

    private int width;
    private int height;

    private GameBoard(int width,int height)
    {
        this.width=width;
        this.height=height;
    }

    public static GameBoard getInstance(int width,int height)
    {
        if(instance==null)
        {
            instance = new GameBoard(width,height);
        }
        return instance;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public boolean isValidPosition(int row,int col)
    {
        
    }
}
