package ASHISH_CODE_HIMSELF.Elevator_System_himself.Models;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Enums.Direction;

public class Request {
    private int sourceFloor;
    private int desiredFloor;
    private Direction direction;

    public Request(int sourceFloor, int desiredFloor, Direction direction)
    {
        this.sourceFloor=sourceFloor;
        this.desiredFloor=desiredFloor;
        this.direction=direction;
    }

      public int getSourceFloor()   { return sourceFloor; }
    public int getDesiredFloor()  { return desiredFloor; }
    public Direction getDirection() { return direction; }
 
}
