package Builder_Design_Pattern.Ugly_Code;

public class Car {
     public Car(String engine, int wheels, int seats, String color, boolean sunroof, boolean navigationSystem) {
         System.out.println("Car created with: engine=" + engine + ", wheels=" + wheels +
                           ", seats=" + seats + ", color=" + color +
                           ", sunroof=" + sunroof + ", navigationSystem=" + navigationSystem);
    }
    public Car(String engine, int wheels, int seats, String color) {
        System.out.println("Car created with: engine=" + engine + ", wheels=" + wheels +
                          ", seats=" + seats + ", color=" + color);
    }
    public Car(String engine, int wheels, int seats) {
        System.out.println("Car created with: engine=" + engine + ", wheels=" + wheels + ", seats=" + seats);
    }
}
