package ASHISH_CODE_HIMSELF.Elevator_System_himself.Models;

import java.util.TreeSet;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Enums.Direction;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Enums.ElevatorState;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    private TreeSet<Integer> upstops;
    private TreeSet<Integer> downstops;

    public Elevator(int id)
    {
        this.id=id;
        this.currentFloor=0;
        this.direction=Direction.IDLE;
        this.state=ElevatorState.IDLE;
        this.upstops=new TreeSet<>();
        this.downstops=new TreeSet<>();
    }

    public void move()
    {
        if(!upstops.isEmpty()){
            direction=Direction.UP;
            state=ElevatorState.UPWARD;
            moveUp();
        }
        else if(!downstops.isEmpty())
        {
            direction=Direction.DOWN;
            state=ElevatorState.DOWNWARD;
            moveDown();
        }
        else{
            state=ElevatorState.IDLE;
            direction=Direction.IDLE;
        }
    }

    public void moveUp()
    {
        currentFloor++;
        System.out.println("Elevator is moving up");
    }

    public void moveDown()
    {
        currentFloor--;
        System.out.println("Elevator is moving down");
    }

    public void openDoors() {
        System.out.println("  Elevator-" + id + " ✦ DOORS OPEN at floor " + currentFloor);
    }

    public void addStops(int floor)
    {
        if(currentFloor<floor)
        {
            upstops.add(floor);
        }
        else if(currentFloor>floor)
        {
            downstops.add(floor);
        }
    }

    public boolean hasStopAtCurrentFloor()
    {
        return upstops.remove(currentFloor) || downstops.remove(currentFloor);
    }

    public void handleRequest()
    {
        addStops(request.getSourceFloor());
        addStops(request.getDesiredFloor());   
    }
    public int getId()            { return id; }
    public int getCurrentFloor()  { return currentFloor; }
    public Direction getDirection() { return direction; }
    public ElevatorState getState() { return state; }
 
    public void setDirection(Direction direction) { this.direction = direction; }
}
