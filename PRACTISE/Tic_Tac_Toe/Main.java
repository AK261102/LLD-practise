package PRACTISE.Tic_Tac_Toe;
import java.util.Scanner;

import QUESTIONS.TicTaeToe_Me.models.Symbols;

/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║                      STEP 7: MAIN CLASS                          ║
 * ╠══════════════════════════════════════════════════════════════════╣
 * ║                                                                  ║
 * ║  Main = Entry point of the program                               ║
 * ║                                                                  ║
 * ║  This is where:                                                  ║
 * ║  ├── Program starts (main method)                                ║
 * ║  ├── We get player names                                         ║
 * ║  ├── We create Player objects                                    ║
 * ║  ├── We create Game object                                       ║
 * ║  └── We start the game                                           ║
 * ║                                                                  ║
 * ║  IMPORTANT PRINCIPLE:                                            ║
 * ║  Main should be SIMPLE - just create objects and call methods    ║
 * ║  All logic should be in other classes!                           ║
 * ║                                                                  ║
 * ╚══════════════════════════════════════════════════════════════════╝
 * 
 * create players
 * create a game object
 * game.start()
 * runs the entire game:
 * show board
 * get moves
 * check winner
 * annouce result
 */

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

          
        System.out.println();
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║                                          ║");
        System.out.println("║         WELCOME TO TIC-TAC-TOE!          ║");
        System.out.println("║                                          ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();
        
        System.out.println("Enter the player 1 name (play X)")
        String name1 =sc.nextLine().trim();
        if(name1.isEmpty())
            name1="Player1";

        System.out.print("Enter Player 2 name (plays O): ");
        String name2 = scanner.nextLine().trim();
        if (name2.isEmpty()) {
            name2 = "Player 2";  // Default name
        }

        Player player1=new Player(name1,Symbol.X);
        Player player2=new Player(name2,Symbol.O);

        Game game = new Game(player1,player2);

        game.start();
        System.out.println("do you want to play the game again");
        String playAgain=sc.nextLine().trim().toLowerCase();
        if(playAgain.equals('y'))
        {
            main(args);// this recursive calls the main function
        }
        else
        {
            System.out.println("BYE");
        }
        sc.close();
    }
}
