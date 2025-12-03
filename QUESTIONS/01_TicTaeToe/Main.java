import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         // Welcome message
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║     WELCOME TO TIC-TAC-TOE!        ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
         System.out.print("Enter Player 1 name (plays X): ");
         String name1=sc.nextLine().trim();
         if(name1.isEmpty())
            name1="Ashish";
         System.out.print("Enter Player 2 name (plays O): ");
         String name2=sc.nextLine().trim();
         if(name2.isEmpty())
         name2="Ayush";
        Player p1=new Player(name1,Symbols.X);
        Player p2=new Player(name2,Symbols.O);
        Game game=new Game(p1,p2);
        game.play();
        sc.close();

    }
}
