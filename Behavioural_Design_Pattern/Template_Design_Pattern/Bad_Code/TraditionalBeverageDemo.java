package Behavioural_Design_Pattern.Template_Design_Pattern.Bad_Code;

import Behavioural_Design_Pattern.Template_Design_Pattern.Bad_Code.Concrete_Beverages.Coffee;

public class TraditionalBeverageDemo {
    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        coffee.prepare();
    }
}
