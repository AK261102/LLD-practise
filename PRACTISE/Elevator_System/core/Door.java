package PRACTISE.Elevator_System.core;

import PRACTISE.Elevator_System.core.Door.DoorState;

public class Door {
    
    public enum DoorState {
        OPEN,
        CLOSED,
        OPENING,
        CLOSING
    }

    private DoorState state;

    public Door()
    {
        this.state=DoorState.CLOSED;
    }

    public void open(){
        if(state==DoorState.CLOSED || state==DoorState.CLOSING){
            state = DoorState.OPENING;

            state = DoorState.OPEN;
        }
    }

    public void closs(){
        if(state == DoorState.OPEN || state == DoorState.OPENING)
        {
            state= DoorState.CLOSED
        }
    }

      /**
     * Check if door is open
     */
    public boolean isOpen() {
        return state == DoorState.OPEN;
    }
    
    /**
     * Check if door is closed
     */
    public boolean isClosed() {
        return state == DoorState.CLOSED;
    }
    
    /**
     * Get current state
     */
    public DoorState getState() {
        return state;
    }
}
