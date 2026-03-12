package ASHISH_CODE_HIMSELF.Elevator_System_himself.DispatchStrategy;

import java.util.List;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Enums.ElevatorState;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Elevator;

public class FcfsStrategy implements DispatchStrategy{
    @Override
    public Elevator selecElevator(Request request, List<Elevator> elevator)
    {
        for(Elevator ele:elevator)
        {
            if(ele.getState()==ElevatorState.IDLE)
            {
                return ele;
            }
        }
        return elevator.get(0);
    }
}
