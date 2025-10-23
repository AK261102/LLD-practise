package Structural-Design-Patterns.Bridge Design Pattern.Good_Code.Concrete_Render_Methods;

public class Raster_Render implements Render {
    @Override
    public void renderCirlce(double radius)
    {
      System.out.println("Raster Rendering: Drawing Circle with radius " + radius);
    }
    @Override
    public void renderRectangle(double width,double height)
    {
         System.out.println("Raster Rendering: Drawing Rectangle with width " + width + " and height " + height);
    }
}
