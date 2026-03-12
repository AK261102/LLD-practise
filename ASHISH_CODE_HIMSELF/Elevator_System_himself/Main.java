package ASHISH_CODE_HIMSELF.Elevator_System_himself;

import ASHISH_CODE_HIMSELF.Elevator_System.Elevator;
import ASHISH_CODE_HIMSELF.Elevator_System.Models.Request;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Service.ElevatorController;

public class Main {
    public static void main(String[] args) {
        ElevatorController ctrl = ElevatorController.getInstance();

        ctrl.addElevator(new Elevator(1));
        ctrl.addElevator(new Elevator(2));

        ctrl.requestFloor(new Request(0,5));
        
    }
}
