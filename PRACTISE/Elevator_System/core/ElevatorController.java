package PRACTISE.Elevator_System.core;

import java.util.ArrayList;

import PRACTISE.Elevator_System.dispatcher.Dispatchstrategy;
import PRACTISE.Elevator_System.dispatcher.NearestElevatorstrategy;

/**
 * ══════════════════════════════════════════════════════════════════
 *            STEP 7: ELEVATOR CONTROLLER (SINGLETON)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ SINGLETON PATTERN ⭐
 * 
 * Central controller that manages all elevators
 * 
 * RESPONSIBILITIES:
 *   - Manage all elevators
 *   - Dispatch requests to appropriate elevator
 *   - Use dispatch strategy (Strategy Pattern)
 * 
 * 
 * WHY SINGLETON?
 * ──────────────
 * - Only ONE controller in the system
 * - All requests go through same controller
 * - Consistent state management
 */

public class ElevatorController {
    
    private static ElevatorController instance;

    private List<Elevator> elevators;
    private Dispatchstrategy dispatchStrategy;
    private int numberOfFloors;

    private ElevatorController(int numberOfFloors,int numberOfElevator)
    {
        this.numberOfFloors=numberOfFloors;
        this.elevators = new ArrayList<>();

        for(int i=1;i<=numberOfElevator;i++)
            elevators.add(new Elevator(i, 1, numberOfFloors ));
        this.dispatchStrategy = new NearestElevatorstrategy();
    }

    public static ElevatorController getInstance(int numberOfFloors,int numberOfElevator)
    {
        if(instance==null)
            return new ElevatorController(numberOfFloors, numberOfElevator);
        return instance;
    }

    public Elevator requestElevator(int floor,Direction direction)
    {
        Request request = Request.externalRequest(floor, direction);

        Elevator selectElevator = dispatchStrategy.selectElevator(elevators, request);

        return selectElevator;
    }

    public void selectFloor(int elevatorId, int floor)
    {
        Elevator elevator = getElevatorById(elevatorId);
        elevator.addRequest(request);
    }
}
