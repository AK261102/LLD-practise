package Structural-Design-Patterns.Bridge Design Pattern.Good_Code.Concrete_Shapes;

public class Rectangle extends Shape {
    public double width;
    public double height;
    public Rectangle(Render render,double width,double height)
    {
        super(render);
        /*
         * this is super is calling the contructor of the parent class shape and passing the argument render to.
         * Ensures correct hierarchy: It ensures both the parent and child parts of the object are set up properly.
         */
        this.width=width;
        this.height=height;
    }
    @Override
    public void draw()
    {
        render.renderRectangle(width,height);
    }
}
