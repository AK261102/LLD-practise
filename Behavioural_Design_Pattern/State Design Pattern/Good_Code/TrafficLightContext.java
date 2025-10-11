package Behavioural_Design_Pattern.State Design Pattern.Good_Code;

public class TrafficLightContext {
    public TrafficLightState currentState;
    public TrafficLightContext()
    {
        currentState=new RedState();

    }
    public void setCurrentState(TrafficLightState state)
    {
        this.currentState=state;
    }
    public void next()
    {
        currentState.next(this);
    }
    public String getColor()
    {
        return currentState.getColor();
    }
}
