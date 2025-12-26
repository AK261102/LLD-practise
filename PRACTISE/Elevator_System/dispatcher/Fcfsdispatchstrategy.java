package PRACTISE.Elevator_System.dispatcher;

import PRACTISE.Elevator_System.core.Elevatorstate;
import PRACTISE.Elevator_System.core.Request;

/**
 * ══════════════════════════════════════════════════════════════════
 *              FCFS DISPATCH STRATEGY
 * ══════════════════════════════════════════════════════════════════
 * 
 * FCFS = First Come First Serve
 * 
 * ALGORITHM:
 * ──────────
 * 1. Find first IDLE elevator
 * 2. If no IDLE, find elevator with least pending requests
 * 
 * 
 * PROS:
 *   - Simple to implement
 *   - Fair (no starvation)
 * 
 * CONS:
 *   - Not efficient
 *   - Doesn't consider distance or direction
 */

public class Fcfsdispatchstrategy implements Dispatchstrategy {
    @Override
    public Elevator selectElevator (List<Elevator> elevators,Request request)
    {
        for(Elevator ele:elevators)
        {
            if(ele.getState()== Elevatorstate.IDLE)
                return ele;
        }

        Elevator bestElevator = null;
        int minRequests = Integer.MAX_VALUE;

        for(Elevator elevator : elevators)
        {
            int pendcount =elevator.getPendingtime();
            if(pendcount<minRequests)
            {
                minRequests=pendcount;
                bestElevator = elevator;
            }
        }

        return bestElevator;
    }
}
