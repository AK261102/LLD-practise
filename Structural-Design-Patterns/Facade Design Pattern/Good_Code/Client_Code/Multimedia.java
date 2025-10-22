package Structural

import java.util.Scanner;

-Design-Patterns.Facade Design Pattern.Good_Code.Client_Code;

public class Multimedia {
    public static void main(String[] args) {
        public Media_Fascade=new Media_Fascade();
        Scanner sc=new Scanner(System.in);
        String action=sc.nextLine();
        Media_Fascade.performAction(action);
        sc.close();
    }
}
