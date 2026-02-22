package ASHISH_CODE_HIMSELF.Factory_Pattern_Practise;

public class Car implements Vehicle {
    
    private String licensePlate;
    private String type;
    public Car(String licensePlate)
    {
        this.licensePlate=licensePlate;
        this.type=type;
    }
    @Override
    public String getType()
    {
        return "LARGE";
    }

    @Override
    public String getLicensePlate()
    {
        return licensePlate;
    }

    @Override
    public String getSize()
    {
        return "BIG";
    }
}
