package ASHISH_CODE_HIMSELF.Java_Practise.First_Code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>(List.of("Ashish","Kumar"));
    for(String name:names)
    {
        System.out.println("Hello, "+name);
    }
    }
}
