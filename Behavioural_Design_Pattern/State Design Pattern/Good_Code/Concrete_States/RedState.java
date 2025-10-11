import Behavioural_Design_Pattern.State.TrafficLight;
import Behavioural_Design_Pattern.State.TrafficLightContext;
import Behavioural_Design_Pattern.State.TrafficLightState;

class RedState implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context)
    {
        context.setState(new GreenState());
    }

    @Override
    public String getColor()
    {
        return "RED";
    }
}