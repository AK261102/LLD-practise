package ASHISH_CODE_HIMSELF.Elevator_System_himself.Models;

import java.util.TreeSet;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Enums.Direction;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Enums.ElevatorState;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    TreeSet<Integer> upstops;
    TreeSet<Integer> downstops;

    public Elevator(int id,int currentFloor, Direction direction, ElevatorState state, TreeSet<Integer> upstops, TreeSet<Integer> downstops, ElevatorState state)
    {
        this.id=id;
        this.currentFloor=currentFloor;
        this.direction=direction;
        this.state=state.IDLE;
        this.upstops=new TreeSet<>();
        this.downstops=new TreeSet<>();
    }

    public void move()
    {
        //
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
        if(currentFloor>floor)
        {
            upstops.add(floor);
        }
        else if(currentFloor<floor)
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

        
    }
    public int getId()            { return id; }
    public int getCurrentFloor()  { return currentFloor; }
    public Direction getDirection() { return direction; }
    public ElevatorState getState() { return state; }
 
    public void setDirection(Direction direction) { this.direction = direction; }
}
