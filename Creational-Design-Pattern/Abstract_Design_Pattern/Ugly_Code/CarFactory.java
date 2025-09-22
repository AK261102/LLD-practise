package Abstract_Design_Pattern.Ugly_Code;
import Abstract_Design_Pattern.Ugly_Code.Concrete_Car_Brands.*;
public class CarFactory {
    public Vehicle createVehicle(String brand)
    {
        if(brand.equals("Honda"))
        {
            return new Honda();
        }
        else if(brand.equals("BMW"))
        {
            return new BMW();
        }
        else if(brand.equals("Toyota"))
        {
            return new Toyota();
        }
        else {
            throw new IllegalArgumentException("Unknown car brand");
        }
    }
}
