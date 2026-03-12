package ASHISH_CODE_HIMSELF.Elevator_System_himself.DispatchStrategy;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Elevator;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Request;

public interface DispatchStrategy {

    Elevator selectElevator(Request request, List<Elevator> elevators);
}
