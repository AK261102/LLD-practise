package PRACTISE.Elevator_System.display;

import PRACTISE.Elevator_System.core.Direction;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 4: DISPLAY CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Displays elevator status:
 *   - Current floor
 *   - Direction (UP/DOWN/IDLE)
 * 
 * 
 * DISPLAY VISUALIZATION:
 * ──────────────────────
 *   ┌─────────────────┐
 *   │   Floor: 5      │
 *   │   Direction: ▲  │
 *   └─────────────────┘
 * 
 * 
 * OBSERVER PATTERN (Optional):
 * ────────────────────────────
 * Display can observe Elevator state changes.
 * When elevator moves, display automatically updates.
 * 
 * For simplicity, we're using direct update calls.
 */


public class Display {
    private int elevatorId;
    private int currentFloor;
    private Direction direction;

    public Display(int elevatorId)
    {
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
        this.direction = Direction.IDLE;
    }

    public void update(int floor,Direction direction)
    {
        this.currentFloor=floor;
        this.direction=direction;
    }
}
