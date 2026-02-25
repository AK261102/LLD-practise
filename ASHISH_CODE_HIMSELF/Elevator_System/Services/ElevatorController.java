package ASHISH_CODE_HIMSELF.Elevator_System.Services;

import java.util.ArrayList;
import java.util.List;

import ASHISH_CODE_HIMSELF.Elevator_System.Elevator;
import ASHISH_CODE_HIMSELF.Elevator_System.Enums.Direction;
import ASHISH_CODE_HIMSELF.Elevator_System.Models.Request;
import ASHISH_CODE_HIMSELF.Elevator_System.Strategy.ElevatorScheduler;
import ASHISH_CODE_HIMSELF.Elevator_System.Strategy.NearestScheduler;

public class ElevatorController {
    private List<Elevator> elevators;
    private ElevatorScheduler scheduler;

    public ElevatorController(int num)
    {
        this.elevators=new ArrayList<>();
        for(int i=1;i<=num;i++)
        {
            elevators.add(new ElevatorController(i));
        }
        this.scheduler=new NearestScheduler();
    }

    public void setScheduler(ElevatorScheduler scheduler)
    {
        this.scheduler=scheduler;
    }

    public void requestElevator(int floor,Direction direction)
    {
        Request request=new Request(floor, direction);
        Elevator chosen = scheduler.schedule(elevators, request);
        chosen.addStop(floor);
    }

    public void addFloor(int elevatorId, int floor)
    {
        Elevator elevator=elevators.get(elevatorId-1);
        elevator.addStop(floor);
    }
    public void step(){
        for(Elevator e: elevators)
        {
            e.move();
        }
    }
      public void runSteps(int n) {
        System.out.println("\n  ⏩ Running " + n + " steps...");
        for (int i = 0; i < n; i++) {
            step();
        }
    }

}
