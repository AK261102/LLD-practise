package Behavioural_Design_Pattern.State Design Pattern.Bad_Code;

public class  TrafficLight {
    String color;

    public TrafficLight()
    {
        this.color="RED";
    }
    public void next()
    {
        if(color.equals("RED"))
        {
            color="GREEN";
            System.out.println(color);
        }
        else if(color.equals("GREEN"))
        {
            color="YELLOW";
        }
    }
    public String getColor()
    {
        return color;
    }
}
