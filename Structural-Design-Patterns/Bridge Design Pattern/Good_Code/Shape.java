package Structural-Design-Patterns.Bridge Design Pattern.Good_Code;

public abstract class Shape {
    public abstract void draw();
    // we need a contructor to accept the render
    public Render render;
    public Shape(Render render)
    {
        this.render=render;
    }
}
