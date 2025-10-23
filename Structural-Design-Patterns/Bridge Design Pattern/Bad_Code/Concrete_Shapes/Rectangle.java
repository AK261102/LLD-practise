package Structural-Design-Patterns.Bridge Design Pattern.Bad_Code.Concrete_Shapes;

public class Rectangle extends Shape{
    @Override
    public void draw()
    {
        System.out.println("Drawing shape of the Rectangle");
    }
}
