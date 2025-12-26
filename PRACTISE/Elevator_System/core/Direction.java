package PRACTISE.Elevator_System.core;

public enum Direction {
    UP,
    DOWN,
    IDLE;

    public Direction Opposite()
    {
        if(this==UP)
            return DOWN;
        if(this==DOWN)
            return UP;
        return IDLE;
    }
    /**
     * Get display symbol
     */
    public String getSymbol() {
        switch (this) {
            case UP: return "▲";
            case DOWN: return "▼";
            default: return "●";
        }
    }
}
