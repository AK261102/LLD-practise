class Vehicle{
    void start(){
        System.out.println("Starting my vehicle");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Starting my car");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("starting my bike");
    }
}
class Truck extends Vehicle{
    @Override
    void start(){
        System.out.println("starting my truck");
    }
}
public class PolyVehicle {
    public static void main(String[] args) {
        Vehicle v1;
        v1=new Car();
        v1.start();
        v1=new Bike();
        v1.start();
        v1=new Truck();
        v1.start();
    }
}
