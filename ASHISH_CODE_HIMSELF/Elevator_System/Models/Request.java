package ASHISH_CODE_HIMSELF.Elevator_System.Models;

import ASHISH_CODE_HIMSELF.Elevator_System.Enums.Direction;

public class Request {
    private int floor;
    private Direction direction;

     public Request(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public int getFloor() { return floor; }
    public Direction getDirection() { return direction; }
}
