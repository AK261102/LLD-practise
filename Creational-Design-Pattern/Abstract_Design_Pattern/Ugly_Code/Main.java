package Abstract_Design_Pattern.Ugly_Code;

public class Main {
    public static void main(String[] args) {
        CarFactory car1=new CarFactory();
        Vehicle vehicle=car1.createVehicle("Honda");
        vehicle.start();
        vehicle.end();
    }
}
