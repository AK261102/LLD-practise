package Factory_Design_Pattern;
import Vehicle;
import car;

public interface  Vehicle {
    void start();
    void stop();

}

public class car implements Vehicle{
    public void start(){
        System.out.println("Starting my car");
    }
    public void stop(){
        System.out.println("Stoping my car");
    }
}

public class truck implements Vehicle{
    public void start(){
        System.out.println("starting my car");
    }
     public void stop(){
        System.out.println("Stoping my truck");
    }
}
public class bike implements Vehicle {
  public void start() {
    System.out.println("Bike is starting...");
  }
  public void stop() {
    System.out.println("Bike is stopping...");
  }
}
public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType)
    {
        if(vehicleType.equals("car"))
        {
            return new car();
        }
        else if(vehicleType.equals("truck"))
        {
            return new truck();
        }
        else if(vehicleType.equals("bike"))
        {
            return new bike();
        }
        else
        {
            throw new IllegalArgumentException("Unknown error");
        }
    }
}
public class main{
    public static void main(String[] args) {
        Vehicle v1=VehicleFactory.getVehicle("car");
        v1.start();;
        v1.stop();
        Vehicle v2=VehicleFactory.getVehicle("truck");
        v2.start();;
        v2.stop();
        Vehicle v3=VehicleFactory.getVehicle("bike");
        v3.start();
        v3.stop();
    }
}
