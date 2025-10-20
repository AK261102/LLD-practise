package Structural

import java.util.Scanner;

-Design-Patterns.Adapter_Design_Pattern.Bad_Code;

public class SmartHomeController {
    public void controlDevices(String device)
    {
        if(device.equalsIgnoreCase("Air-conditioner"))
        {
            System.out.println("Air conditioner is starting");
        }
        else if(device.equalsIgnoreCase("SmartLight"))
        {
            System.out.println("Lighting is starting");
        }
        else
        {
            System.out.println("No other is starting");
        }
        
    }
    public static void main(String[] args) {
        SmartHomeController system=new SmartHomeController();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Smart Home Controller!");
        System.out.println("Available devices: AirConditioner, SmartLight, CoffeeMachine");
        while (true) {
            System.out.println(("Please enter the device name"));
            String deviceName=sc.nextLine();
            if(deviceName.equalsIgnoreCase("exit"))
            {
                System.out.println("exiting ");
                break;
            }
            system.controlDevices(deviceName);
        }
        sc.close();
    }
}
