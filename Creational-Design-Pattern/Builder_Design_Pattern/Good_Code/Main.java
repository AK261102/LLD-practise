package Builder_Design_Pattern.Good_Code;

import Builder_Design_Pattern.Good_Code.Car;;
public class Main{
    public static void main(String[] args)
    {
        Car.CarBuilder builder=new Car.CarBuilder();
        Car car1 = builder.setEnginee("V8")
                .setColor("Red")
                .setSeats(5)
                .setSunroof(true)
                .build(); // The build method returns the final product
        System.out.println(car1);
    }
}