package ASHISH_CODE_HIMSELF.Elevator_System_himself.DispatchStrategy;

import java.util.List;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Elevator;

public class NearestElevatorStrategy implements DispatchStrategy {
    @Override
    public Elevator selectElevator(Request request, List<Elevator> elevator)
    {
        // select the elevator with mininum distance
    }
}
