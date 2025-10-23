package Structural-Design-Patterns.Bridge Design Pattern.Good_Code.Concrete_Shapes;

public class Circle  extends Shape{
    public double radius;
    public Circle(Render render, double radius)
    {
        super(render);
        this.radius=radius;
    }
    @Override
    public void draw()
    {
        render.renderCirlce(radius);
    }
}
