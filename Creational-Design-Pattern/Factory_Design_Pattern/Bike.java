package Factory_Design_Pattern;
import Vehicle;

public class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
    
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}
