package Behavioural_Design_Pattern.Template_Design_Pattern.Good_Code;

public abstract class Beverage {
    
    final void prepare()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater()
    {
        System.out.println("Boiling water");
    }
    public void pourInCup()
    {
        System.out.println("Serving TEA");
    }
    public abstract void brew();
    public abstract void addCondiments();
     
}
