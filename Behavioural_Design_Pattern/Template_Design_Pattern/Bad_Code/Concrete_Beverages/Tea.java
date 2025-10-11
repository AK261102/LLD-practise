package Behavioural_Design_Pattern.Template_Design_Pattern.Bad_Code.Concrete_Beverages;

public class Tea {
    void prepare()
    {
        boilWater();
        addTea();
        addMilk();
        serveHot();
    }

    void boilWater()
    {
        System.out.println("My water is boiling");
    }
    void addTea()
    {
        System.out.println("Add Tea");
    }
    void addMilk()
    {
        System.out.println("Add Milk");
    }
    void serveHot()
    {
        System.out.println("serve it");
    }
}
