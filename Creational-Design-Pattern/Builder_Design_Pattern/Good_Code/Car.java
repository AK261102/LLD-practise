package Builder_Design_Pattern.Good_Code;

import java.lang.classfile.CodeBuilder.CatchBuilder;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;
    // constructor should be private and it should be used by constructor
    private Car(CarBuilder builder){
        this.engine=builder.engine;
        this.wheels=builder.wheels;
        this.seats=builder.seats;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }
    public String getEngine(){
        return engine;
    }
    public int getWheels(){
        return wheels;
    }
    public int getSeats(){
        return seats;
    }
    public String getColor() {
        return color;
    }
    public boolean hasSunroof() {
        return sunroof;
    }
    public boolean hasNavigationSystem() {
        return navigationSystem;
    }
    @Override
    public String toString(){
         return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats
                + ", color=" + color + ", sunroof=" + sunroof
                + ", navigationSystem=" + navigationSystem + "]";
    }
    public static class CarBuilder{
        private String engine;
        private int wheels=4;
        private int seats=5;
        private String color = "Black"; // Default value
        private boolean sunroof = false; // Default value
        private boolean navigationSystem = false; // Default value

        // this CarBuilder will set the attributes
        public CarBuilder setEnginee(String engine){
            this.engine=engine;
            return this;
        }
        public CarBuilder setWheels(int wheels){
            this.wheels=wheels;
            return this;
        }
        public CarBuilder setSeats(int seats){
            this.seats=seats;
            return this;
        }
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }
        // this method to create a car object
        public Car build(){
            return new Car(this);// return a new car created using the builder's values
            
        }
    }
}
