package Behavioural_Design_Pattern.Template_Design_Pattern.Good_Code;

import Behavioural_Design_Pattern.Template_Design_Pattern.Good_Code.Concrete_Beverages.CoffeeBeverage;

public class BeverageTemplateDemo {
    public static void main(String[] args) {
              Beverage coffee=new CoffeeBeverage();
              coffee.prepare();
    }
}
