package Structural-Design-Patterns.Composite_Design_Pattern.Good_Code.Client_Code;

public class SmartHomeController {
    public static void main(String[] args) {
        SmartComponent airConditioner=new AirConditioner();
        SmartComponent smartLight=new SmartLight();
        // these are the individual devices i have created
        CompositeSmartComponent room1=new CompositeSmartComponent();
        room1.add(airConditioner);
        room1.add(smartLight);
        room1.turnOn();
        room1.turnOff();
        CompositeSmartComponent room2=new CompositeSmartComponent();
        room2.add(airConditioner);
        room2.add(smartLight);
        room2.turnOn();
        room2.turnOff();
        CompositeSmartComponent house=new CompositeSmartComponent();
        house.add(room1);
        house.add(room2);
        house.turnOn();
        house.turnOff();
    }
}
