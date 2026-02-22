package ASHISH_CODE_HIMSELF.Java_Practise.Abstract_Class_Practise;

 class Circle extends Shape {
    private double radius;

    public Circle(String color,double radius)
    {
        super(color);
        this.radius=radius;
    }

    @Override
    public double calculateArea()
    {
        double area=3.14*r*r;
        return area;
    }
}
