package Structural-Design-Patterns.Adapter_Design_Pattern.Good_Code.Concrete_Adapters;

import Structural.*;
public class AirConditionerAdapter implements SmartDevice {
    public AirConditioner airConditioner;
    public AirConditionerAdapter(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }
    @Override
    public void turnon()
    {
        airConditioner.ConnectWithBlueTooth();
        airConditioner.startCooling();
    }
    @Override
    public void turnoff()
    {
        airConditioner.stopCooling();
    }
}
