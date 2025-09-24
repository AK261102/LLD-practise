package Factory_Design_Pattern;
import Vehicle;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    
    public void stop() {
        System.out.println("Car is stopping...");
    }
}
