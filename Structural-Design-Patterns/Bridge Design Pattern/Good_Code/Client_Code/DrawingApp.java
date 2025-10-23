package Structural

import javax.swing.Renderer;

-Design-Patterns.Bridge Design Pattern.Good_Code.Client_Code;

public class DrawingApp {
    public static void main(String[] args) {
        Renderer rR=new Raster_Render();
        Renderer vR=new Vector_Render();
        Shape rC=new Circle(rR,5);
        Shape vC=new Circle(vR,5);
        Shape rrec=new Rectangle(rR,6,5);
        Shape vRec=new Rectangle(vR,6,5);
        rC.draw();
        vC.draw();
        rrec.draw();
        vRec.draw();
    }
}
