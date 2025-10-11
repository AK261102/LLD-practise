package Behavioural_Design_Pattern.Template_Design_Pattern.Good_Code.Concrete_Beverages;

import Behavioural_Design_Pattern.Template_Design_Pattern.Good_Code.*;

public class TeaBeverage extends Beverage{
    
    @Override
    public void brew()
    {
        System.out.println("Brewing Tea");
    }

     @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}
