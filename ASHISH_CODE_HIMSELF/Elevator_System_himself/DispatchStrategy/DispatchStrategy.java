package ASHISH_CODE_HIMSELF.Elevator_System_himself.DispatchStrategy;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Elevator;

public interface DispatchStrategy {
    
    Elevator selectElevator(Request request, List<Elevator> elevator);
}
