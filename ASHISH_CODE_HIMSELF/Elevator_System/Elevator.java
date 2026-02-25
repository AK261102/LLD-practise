package ASHISH_CODE_HIMSELF.Elevator_System;

import java.util.TreeSet;

import ASHISH_CODE_HIMSELF.Elevator_System.Enums.Direction;
import ASHISH_CODE_HIMSELF.Elevator_System.Enums.ElevatorState;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    private TreeSet<Integer> upStops;
    private TreeSet<Integer> downStops;

    public Elevator(int id)
    {
        this.id=id;
        this.currentFloor=0;
        this.direction=Direction.IDLE;
        this.state=ElevatorState.IDLE;
        this.upStops=new TreeSet<>();
        this.downStops=new TreeSet<>();
    }

    // add a floor stop
    public void addStop(int floor)
    {
        if(floor==currentFloor)
        {
            openDoor();
            return;
        }
        if(floor>currentFloor)
        {
            upStops.add(floor);
        }
        else
        {
            downStops.add(floor);
        }

        if(state==ElevatorState.IDLE)
        {
            direction=(floor>currentFloor)?Direction.UP:Direction.DOWN;
            state=(direction==Direction.UP) ? ElevatorState.MOVING_UP?ElevatorState.DOWN;
        }
    }

    public void move()
    {
        if(state==ElevatorState.IDLE || state==ElevatorState.DOOR_OPEN)
        {
            return;
        }

        if(direction==Direction.UP)
        {
            currentFloor++;
              System.out.println("    Elevator " + id + " → Floor " + currentFloor);

              if(upStops.contains(currentFloor))
              {
                upStops.remove(currentFloor);
                openDoor();
              }

              // if no more stops are there, then direction change it
              if(upStops.isEmpty())
              {
                if(!downStops.isEmpty()){
                    direction=Direction.DOWN;
                    state=ElevatorState.MOVING_DOWN;
                }
                else
                {
                    direction=Direction.IDLE;
                    state=ElevatorState.IDLE;
                }
              }
        }
        else if(direction==Direction.DOWN)
        {
            currentFloor--;
            System.out.println("    Elevator " + id + " → Floor " + currentFloor);
            if(downStops.contains(currentFloor))
            {
                openDoor();
                downStops.remove(currentFloor);
            }

            if(downStops.isEmpty())
            {
                if(!upStops.isEmpty())
                {
                    direction=Direction.UP;
                    state=ElevatorState.MOVING_UP;
                }
                else
                {
                    direction=Direction.IDLE;
                    state=ElevatorState.IDLE;
                }
            }

        }
    }

    private void openDoor() {
        System.out.println("    Elevator " + id + " 🔓 Door OPEN at floor " + currentFloor);
        // In real system: wait, then close. Here we just log it.
    }

     public boolean isIdle() { return state == ElevatorState.IDLE; }

     public boolean isMovingTowards(int floor)
     {
        if(direction == Direction.UP && floor>=currentFloor)
            return true;
        if(direction == Direction.DOWN && floor<=currentFloor)
            return true;
        return false;

     }

     public int distanceTo(int floor)
     {
        return Math.abs(currentFloor-floor);
     }

      public int totalPendingStops() {
        return upStops.size() + downStops.size();
    }

    // --- Getters ---
    public int getId() { return id; }
    public int getCurrentFloor() { return currentFloor; }
    public Direction getDirection() { return direction; }
    public ElevatorState getState() { return state; }


}
