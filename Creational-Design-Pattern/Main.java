public class Main {
    public static void main(String[] args) {
        System.out.println("Using Factory Pattern:");
        
        Vehicle vehicle1 = VehicleFactory.getVehicle("car");
        vehicle1.start();
        vehicle1.stop();
        
        System.out.println();
        
        Vehicle vehicle2 = VehicleFactory.getVehicle("truck");
        vehicle2.start();
        vehicle2.stop();
        
        System.out.println();
        
        Vehicle vehicle3 = VehicleFactory.getVehicle("bike");
        vehicle3.start();
        vehicle3.stop();
    }
}