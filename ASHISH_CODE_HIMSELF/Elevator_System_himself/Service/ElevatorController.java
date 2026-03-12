package ASHISH_CODE_HIMSELF.Elevator_System_himself.Service;

import java.util.ArrayList;
import java.util.List;

import ASHISH_CODE_HIMSELF.Elevator_System_himself.DispatchStrategy.DispatchStrategy;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.DispatchStrategy.FcfsStrategy;
import ASHISH_CODE_HIMSELF.Elevator_System_himself.Models.Elevator;

public class ElevatorController {
    private static ElevatorController instance;

    private ElevatorController(){
        this.elevators=new ArrayList<>();
        this.strategy=new FcfsStrategy();
    }

    public static ElevatorController getInstance()
    {
        if(instance==null)
        {
            instance = new ElevatorController();
        }
        return instance;
    }
    List<Elevator> elevators;
    DispatchStrategy strategy;

    public void addElevator(Elevator e)
    {
        elevators.add(e);
    }

    public void requestFloor(Request request)
    {
        System.out.println("\n>> New " + request);

        Elevator picked = strategy.selectElevator(request, elevators);
        picked.handleRequest(request);
    }

    public void move()
    {
        for(Elevator e:elevators)
        {
            e.move();
        }
    }

    public void changeDispatchStrategy(DispatchStrategy strategy)
    {
        this.strategy=strategy;
    }
}
