package Structural-Design-Patterns.Adapter_Design_Pattern.Good_Code.Concrete_Adapters;

import Structural.*;
public class SmartLightAdapter {
    public SmartLight smart;
    public SmartLightAdapter(SmartLight smart)
    {
        this.smart=smart;
    }
    @Override
    void turnon()
    {
        smart.ConnectWithWifi();
        smart.OnSwitch();
    }
    @Override
    void turnoff()
    {
        smart.OffSwitch();
        smart.DisconnectWithWifi();
    }
}
