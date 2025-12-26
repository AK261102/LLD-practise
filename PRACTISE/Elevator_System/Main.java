package PRACTISE.Elevator_System;

import PRACTISE.Elevator_System.core.Building;
import PRACTISE.Elevator_System.dispatcher.NearestElevatorstrategy;
import apple.laf.JRSUIConstants.Direction;

public class Main {
    public static void main(String[] args) {
        Building build = new Building("Vinayak", 3, 10);
        build.dispatchStrategy(new NearestElevatorstrategy());
        build.callElevator(7,PRACTISE.Elevator_System.core.Direction.DOWN);
        build.selectFloor(9,PRACTISE.Elevator_System.core.Direction.UP);

    }
}
