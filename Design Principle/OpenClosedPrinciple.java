
abstract class Shape{
    abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3.14*radius*radius;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea(){
        return 0.5*base*height;
    }
}
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println("Circle area: " + c1.calculateArea());
        
        Triangle t1 = new Triangle(4.0, 3.0);
        System.out.println("Triangle area: " + t1.calculateArea());
    }
}
