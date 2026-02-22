package ASHISH_CODE_HIMSELF.Factory_Pattern_Practise;

public interface VehiceType {
    BIKE("SMALL");
    CAR("LARGE");
    private String type;
    public VehiceType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return type;
    }
}
