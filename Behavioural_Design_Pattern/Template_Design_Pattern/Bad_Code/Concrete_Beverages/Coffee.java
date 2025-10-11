package Behavioural_Design_Pattern.Template_Design_Pattern.Bad_Code.Concrete_Beverages;

public class Coffee {
    public void prepare()
    {
        boilWater();
        addCoffee();
        addMilk();
        serveHot();
    }

   public void boilWater()
    {
        System.out.println("My water is boiling");
    }
    public void addCoffee()
    {
        System.out.println("Add coffee");
    }
    public void addMilk()
    {
        System.out.println("Add Milk");
    }
    public void serveHot()
    {
        System.out.println("serve it");
    }
}
