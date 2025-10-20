package Structural-Design-Patterns.Adapter_Design_Pattern.Good_Code.Client_Code;

import Structual.*;

public class SmartHomeController {
    public static void main(String[] args) {
        // goal is to control different types of smart devices using common interfaces.
        //SmartDevice -means these object will have common methods from the interface
        /*
         * This constructs a new object of the AirConditionerAdapter class. 
         * The Adapter wraps around a specific AirConditioner device so that it can 
         * be controlled through the common SmartDevice interface.
         */
        /*
         * This creates a new AirConditioner device (the real, underlying object representing the air conditioner).
         *  It is passed as an argument to the adapter.
         *  The adapter will use this instance inside to translate universal SmartDevice commands into 
         * commands that the AirConditioner understands.
         */
        SmartDevice AirConditioner=new AirConditionerAdapter(new AirConditioner());
        SmartDevice CoffeeMachine=new CoffeeMachineAdapter(new CoffeeMachine());
        AirConditioner.turnon();
        AirConditioner.turnoff();
        CoffeeMachine.turnon();
        CoffeeMachine.turnoff();
    }
}
