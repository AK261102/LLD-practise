package PRACTISE.Snake&Food.Game;

public class Snake {
    
    /**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 5: SNAKE CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Snake maintains:
 *   - Body segments as Deque (double-ended queue)
 *   - Position map for O(1) collision detection
 * 
 * 
 * WHY DEQUE?
 * ──────────
 * Snake movement:
 *   1. Add new head at FRONT
 *   2. Remove tail from BACK
 * 
 * Deque operations:
 *   - addFirst() → O(1)
 *   - pollLast() → O(1)
 * 
 * ArrayList would be O(n) for addFirst()!
 * 
 * 
 * SNAKE VISUALIZATION:
 * ────────────────────
 *   Deque: [HEAD] ← [BODY] ← [BODY] ← [TAIL]
 *          Front                       Back
 * 
 *   On board:
 *   ┌───┬───┬───┬───┬───┐
 *   │ T │ B │ B │ H │   │  T=Tail, B=Body, H=Head
 *   └───┴───┴───┴───┴───┘
 * 
 *   Move RIGHT:
 *   ┌───┬───┬───┬───┬───┐
 *   │   │ T │ B │ B │ H │  New head added, old tail removed
 *   └───┴───┴───┴───┴───┘
 */


/*
 * ══════════════════════════════════════════════════════════════════
 *              INTERVIEW POINT: TIME COMPLEXITY
 * ══════════════════════════════════════════════════════════════════
 * 
 * Operation           | Time Complexity
 * ─────────────────────────────────────
 * move()              | O(1) - Deque addFirst + pollLast
 * grow()              | O(1) - Deque addFirst
 * collidesWithSelf()  | O(1) - HashMap containsKey
 * getHead()           | O(1) - Deque peekFirst
 * getTail()           | O(1) - Deque peekLast
 * 
 * ALL OPERATIONS ARE O(1)! 🎉
 * 
 * This is why we use:
 *   - Deque instead of ArrayList
 *   - HashMap for position tracking
 */

    public class Snake{
        private Deque<Pair> body;

        private Map<Pair,Boolean> positionMap;

        public Snake(){
            this.body=new LinkedList<>();
            this.positionMap = new HashMap<>();

            Pair intialPos = new Pair(0,0);
            this.body.offerFirst(intialPos);
            this.positionMap.put(intialPos,true);
        }

        public Snake(int startRow,int startCol){
            this.body=new LinkedList<>();
            this.positionMap = new HashMap<>();
            Pair intialPos = new Pair(startRow,startCol);
            this.body.offerFirst(intialPos);
            this.positionMap.put(intialPos,true);
        }
           /**
     * Get current head position
     */
    public Pair getHead() {
        return body.peekFirst();
    }
    
    /**
     * Get current tail position
     */
    public Pair getTail() {
        return body.peekLast();
    }
    
    /**
     * Get snake length
     */
    public int getLength() {
        return body.size();
    }
    
    /**
     * Get all body positions (for rendering)
     */
    public List<Pair> getBody() {
        return new ArrayList<>(body);
    }
    
    public void move(Pair newHead){
        body.offerFirst(newHead);
        positionMap.put(newHead,true);
        Paur oldTail = body.pollLast();
        positionMap.remove(oldTail);
    }
    public void grow(Pair newHead){
        body.offerFirst(newHead);
        positionMap.put(newHead,true);
    }

    public void detectCollision(Pair position)
    {
        return positionMap.containsKey(position) ;
    }



    }

}
