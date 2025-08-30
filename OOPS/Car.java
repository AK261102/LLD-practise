public class Car {
    String manufacturer;
    String model;
    int year;

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting engine of " + year + " " + manufacturer + " " + model);
    }

    public void printDetails() {
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Figo", 2011);
        car1.startEngine();
        car1.printDetails();
    }
}