package ASHISH_CODE_HIMSELF.Factory_Pattern_Practise;

public class VehicleFactory {
    public static createVehicle(String type, String licensePlate)
    {
        switch (type.toUpperCase()) {
            case "CAR": return new Car(type,licensePlate)
                
                break;
        
            default:
                break;
        }
    }
}
