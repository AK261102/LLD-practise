package ASHISH_CODE_HIMSELF.Elevator_System_himself;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Elevator;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Request;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Service.ElevatorController;

public class Main {
    public static void main(String[] args) {
        ElevatorController ctrl = ElevatorController.getInstance();

        ctrl.addElevator(new Elevator(1));
        ctrl.addElevator(new Elevator(2));

        for(int i=0;i<10;i++)
        {
            ctrl.move();
        }
        
    }
}
