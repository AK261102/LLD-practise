

public GreenState implements TrafficLightContext{

    @Override
    public void next(TrafficLightContext context)
    {
        context.setState(new YellowState());
    }

    @Override
    public void setColor()
    {
        context.getColor();
    }
}