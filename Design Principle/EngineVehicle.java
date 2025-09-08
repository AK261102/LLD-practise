

abstract class Vehicle{
    public void move(){

    }
}

abstract class EngineKiVehicle extends Vehicle{
    public void startEngine(){

    }
}
abstract class NonEngineKiVehicle extends Vehicle{
    public void startEngine(){
        
    }
}

 class car extends EngineKiVehicle{
    public void startEngine(){

    }
}

 class bicycle extends NonEngineKiVehicle{
    public void startEngine(){

    }
}
public class EngineVehicle {
    public static void main(String[] args) {
        EngineKiVehicle c1=new car();
        c1.startEngine();
    }
}
