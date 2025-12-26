package PRACTISE.Elevator_System.core;

public class Building {
    private String name;
    private int numberOfElevator;
    private int numberOfFloors;
    private ElevatorController controller;

    public Building(String name,int numberOfElevator,int numberOfFloors)
    {
        this.name=name;
        this.numberOfElevator=numberOfElevator;
        this.numberOfFloors=numberOfFloors;
        this.controller = ElevatorController.getInstance(numberOfFloors, numberOfElevator);
    }

    public Elevator callElevator(int numberOfFloors,Direction direction)
    {
        return controller.requestElevator(numberOfFloors, direction);
    }

    public void selectFloor(int elevatorId, int floor) {
        validateFloor(floor);
        controller.selectFloor(elevatorId, floor);
    }
}
