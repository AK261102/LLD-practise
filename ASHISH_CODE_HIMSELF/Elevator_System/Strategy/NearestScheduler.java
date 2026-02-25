package ASHISH_CODE_HIMSELF.Elevator_System.Strategy;

import java.util.List;

import ASHISH_CODE_HIMSELF.Elevator_System.Elevator;
import ASHISH_CODE_HIMSELF.Elevator_System.Models.Request;

public class NearestScheduler implements ElevatorScheduler{
    @Override
    public Elevator schedule(Request request, List<Elevator> elevators)
    {
        Elevator best =null;
        int bestDist =Integer.MAX_VALUE;
        for(Elevator e: elevators)
        {
            int dist=e.distanceTo(request.getFloor());

            if(e.isIdle() && bestDist>dist)
            {
                best=e;
                bestDist=dist;
            }
            else if(!e.isIdle() && e.isMovingTowards(request.getFloor()) && dist<bestDist)
            {
                best=e;
                bestDist=dist;
            }
        }
        if(best==null)
        {
            for(Elevator e: elevators)
            {
                int dist=e.distanceTo(request.getFloor());
                if(dist<bestDist)
                {
                    best=e;
                    bestDist=dist;
                }
            }
        }
        return best;
    }
}
