package ASHISH_CODE_HIMSELF.Elevator_System.Strategy;

import ASHISH_CODE_HIMSELF.Elevator_System.Elevator;

public interface ElevatorScheduler {
    public Elevator schedule(Request request, List<Elevator> elevators);
} 
