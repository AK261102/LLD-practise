class Room{
    String name;
    Room(String name){
        this.name=name;
    }
}

class House{
    private Room livingRoom;
    private Room kitchen;
    House(){
        livingRoom = new Room("Living room");
        kitchen=new Room("Kitchen");
    }
    void showhouse(){
        System.out.println("This is my living room: " + livingRoom.name);
        System.out.println("This is my kitchen: " + kitchen.name);
    }
}
public class CompositionDemo {
    public static void main(String[] args)
    {
        House house=new House();
        house.showhouse();
    }
}
