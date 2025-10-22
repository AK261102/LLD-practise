package Structural-Design-Patterns.Facade Design Pattern.Bad_Code;

public class ImageViewer {
    public void loadImage()
    {
        System.out.println("Loading the image");
    }
    public void applyScaling()
    {
        System.out.println("Zoom in and out");
    }
    public void displayImage()
    {
        System.out.println("Display karo images");
    }
}
