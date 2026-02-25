package ASHISH_CODE_HIMSELF.Elevator_System;

import ASHISH_CODE_HIMSELF.Elevator_System.Enums.Direction;
import ASHISH_CODE_HIMSELF.Elevator_System.Services.ElevatorController;

public class Main {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController(3);

        controller.requestElevator(2, Direction.UP);
        controller.runSteps(3);
        controller.pressFloor(1,8);x
    }
}
