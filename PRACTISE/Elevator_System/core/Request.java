package PRACTISE.Elevator_System.core;

import javax.print.attribute.standard.Destination;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 2: REQUEST CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Represents a request for an elevator
 * 
 * EXTERNAL REQUEST:
 * ─────────────────
 *   - Made from floor button (UP/DOWN)
 *   - sourceFloor = where person is waiting
 *   - direction = UP or DOWN
 *   - destFloor = unknown (-1)
 * 
 *   Example: Person at Floor 3 presses UP
 *            Request(sourceFloor=3, direction=UP, type=EXTERNAL)
 * 
 * 
 * INTERNAL REQUEST:
 * ─────────────────
 *   - Made from inside elevator
 *   - destFloor = where person wants to go
 * 
 *   Example: Person inside presses 7
 *            Request(destFloor=7, type=INTERNAL)
 */

public class Request {
    private int sourceFloor;
    private int destinationFloor;
    private Direction direction;
    private Requesttype type;
    private long timestamp;


    public static Request externalRequest(int sourceFloor,Direction direction)
    {
        Request req= new Request();
        req.sourceFloor =sourceFloor;
        req.destinationFloor =-1;
        req.direction=direction;
        req.type = Requesttype.EXTERNAL;
        req.timestamp = System.currentTimeMillis();
        return req;
    }

    public static Request internalRequest(int currentFlorr,Destination destination)
    {
        Request request = new Request();
        request.sourceFloor = currentFlorr;
        request.destinationFloor=destination;
        request.direction = sourceFloor > destinationFloor ? direction.UP :Direction.DOWN;
        request.type= Requesttype.INTERNAL;
        request.timestamp=System.currentTimeMillis();
        return re;
        
    }

    private Request (){}
     public int getSourceFloor() {
        return sourceFloor;
    }
    
    public int getDestinationFloor() {
        return destinationFloor;
    }
    
    public Direction getDirection() {
        return direction;
    }
    
    public RequestType getType() {
        return type;
    }
    
    public long getTimestamp() {
        return timestamp;
    }

     /**
     * Get the floor elevator should go to for this request
     */
    public int getTargetFloor() {
        if (type == RequestType.EXTERNAL) {
            return sourceFloor;  // Go pick up the person
        } else {
            return destinationFloor;  // Go to selected floor
        }
    }
    
    @Override
    public String toString() {
        if (type == RequestType.EXTERNAL) {
            return "EXTERNAL[Floor " + sourceFloor + " " + direction.getSymbol() + "]";
        } else {
            return "INTERNAL[To Floor " + destinationFloor + "]";
        }
    }
}
