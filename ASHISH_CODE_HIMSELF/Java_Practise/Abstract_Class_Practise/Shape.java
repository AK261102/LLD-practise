package ASHISH_CODE_HIMSELF.Java_Practise.Abstract_Class_Practise;

abstract class Shape {
    
    private String name;

    public Shape(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public abstract double calculateArea();

    public void printDetails()
    {
        System.out.println("Name = "+name+" calculate area = "+calculateArea());
    }
}
