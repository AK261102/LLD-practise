package PRACTISE.Elevator_System.core;

import java.util.TreeSet;

import PRACTISE.Elevator_System.display.Display;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 6: ELEVATOR CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Core class representing a single elevator
 * 
 * RESPONSIBILITIES:
 *   - Track current floor
 *   - Track direction
 *   - Manage door
 *   - Process requests
 *   - Move between floors
 * 
 * 
 * INTERNAL DATA STRUCTURES:
 * ─────────────────────────
 * 
 * upStops: TreeSet<Integer>
 *   - Floors to stop at while going UP
 *   - Sorted in ascending order
 *   - Example: {3, 5, 7, 9}
 * 
 * downStops: TreeSet<Integer>
 *   - Floors to stop at while going DOWN
 *   - Sorted in descending order
 *   - Example: {8, 6, 4, 2}
 * 
 * WHY TreeSet?
 *   - Automatically sorted
 *   - No duplicates
 *   - O(log n) add/remove
 *   - Easy to get next stop
 */

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private Elevatorstate state;

    private Door door;
    private Display display;

    private TreeSet<Integer> upStops;
    private TreeSet<Integer> downStops;

    private int minFloor;
    private int maxFloor;


    public Elevator(int id,int minFloor,int maxFloor)
    {
        this.id=id;
        this.currentFloor = minFloor;
        this.direction = Direction.IDLE;
        this.state = Elevatorstate.IDLE;
        this.minFloor=minFloor;
        this.maxFloor=maxFloor;
        this.door = new Door();
        this.display=new Display(id);
        this.upStops = new TreeSet<>();
        this.downStops = new TreeSet<>(reverseorder);
    }

    public void addStop(int floor,Direction dir)
    {
        id(floor>currentFloor)
        upStops.add(floor);
        else
        downStops.add(floor);
    }

    public void addRequest(Request request)
    {
        int targetFloor= request.getTargetFloor();
        addStop(targetFloor, request.getDirection());
    }

    public void move()
    {
        if(state == Elevatorstate.IDLE)
            return;
        if(direction == Direction.UP)
            moveUp();
        else
            moveDown();
    }

    private void moveUp()
    {
        if(currentFloor<maxFloor)
        {
            currentFloor++;
            if(upStops.contains(currentFloor))
            {
                stopAtFloor();
                upStops.remove(currentFloor);
            }

            if(upStops.isEmpty())
            {
                if(!downStops.isEmpty())
                {
                    direction=Direction.DOWN;

                }
                else
                {
                    idle
                }
            }
        }
    }

    private void moveDown()
    {
        if(currentFloor>minFloor)
        {
            currentFloor--;
            if(downStops.contains(currentFloor))
            {
                stopAtFloor();
                downStops.remove(currentFloor);
            }

            if(downStops.isEmpty())
            {
                if(!upStops.isEmpty())
                {
                    direction= Direction.UP;

                }
                else
                    IDLE;
            }
        }
    }
     private void stopAtFloor() {
        state = ElevatorState.STOPPED;
        System.out.println("   ⏹️ Elevator " + id + " STOPPED at Floor " + currentFloor);
        
        door.open();
        // Passengers enter/exit
        simulateDelay(1000);  // Wait for passengers
        door.close();
        
        state = ElevatorState.MOVING;
    }
}
