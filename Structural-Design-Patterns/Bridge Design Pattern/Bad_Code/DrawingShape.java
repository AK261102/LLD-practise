package Structural

import java.util.Scanner;

-Design-Patterns.Bridge Design Pattern.Bad_Code;

public class DrawingShape {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter which shape");
    String answer=sc.nextLine();
    if(answer.equalsIgnoreCase("rectangle shape using vector"))
    {
        Rectangle rc=new Rectangle();
        rc.draw();
    }
    else if(answer.equalsIgnoreCase("cirle shape using vector"))
    {
        Circle cr=new Circle();
        cr.draw();
    }
    }
}
