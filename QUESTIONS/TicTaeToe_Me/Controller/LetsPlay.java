package QUESTIONS.TicTaeToe_Me.Controller;

import java.util.Scanner;

import QUESTIONS.TicTaeToe_Me.models.Board;

public class LetsPlay {
    /*
    this class main respondibilty is to
    1. game will be played untill all the cells of the boards are fills
    2. check karna win condition
    3. every time agar turn giving the players the chance to select the cell and add the symbols    
    */
   Board b;
   public static void LetsPlayGame(Player p1,Player p2)
   {
    while(!b)
    {
        Scanner sc =new Scanner();
        System.out.println("Enter the row ");
        int i=sc.nextLine().trim();
        System.out.println("Enter the col");
        int j=sc.nextLine().trim();
        makeMove(i,j,p1);
        checkWin();
         System.out.println("Enter the row ");
        int i=sc.nextLine().trim();
        System.out.println("Enter the col");
        int j=sc.nextLine().trim();
        makeMove(i,j,p2)
        checkWin();
    }
   }
   public static boolean checkFillBoard(Board board)
   {

   }
}
