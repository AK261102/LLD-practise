package PRACTISE.Tic_Tac_Toe;

import java.util.Scanner;

/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║                      STEP 4: PLAYER CLASS                        ║
 * ╠══════════════════════════════════════════════════════════════════╣
 * ║                                                                  ║
 * ║  Player represents one person playing the game                   ║
 * ║                                                                  ║
 * ║  Each player has:                                                ║
 * ║  ├── name: "Rahul", "Priya", etc.                                ║
 * ║  ├── symbol: X or O                                              ║
 * ║  └── can make moves on the board                                 ║
 * ║                                                                  ║
 * ║  Example:                                                        ║
 * ║  ┌─────────────────────────────────────────┐                     ║
 * ║  │  Player 1          │  Player 2          │                     ║
 * ║  │  Name: Rahul       │  Name: Priya       │                     ║
 * ║  │  Symbol: X         │  Symbol: O         │                     ║
 * ║  └─────────────────────────────────────────┘                     ║
 * ║                                                                  ║
 * ╚══════════════════════════════════════════════════════════════════╝
 */


public class Player {

    /**
     * these are attributes :name and symbols
     * create a player and
     * ask player about the moves they want to make
     * this method
     * show prompt to player
     * read their input(row,col)
     * return position as int array [row,col]
     * i am expecting the input from the user as "0,1" ir :1, 2 etc
     * they might have given the row,col and there is comma in between it
     * i want to return two items row and cols so return array
     */
   private String name;
   private Symbol symbol;
   private Scanner scanner;

   public Player(String name, Symbol symbol)
   {
    this.name=name;
    this.symbol=symbol;
    this.scanner=new Scanner(System.in);
   }

   public String getName()
   {
    return name;
   }

   public String getSymbol()
   {
    return symbol;
   }

   public int[] makeMoves(){
     System.out.print(name + " (" + symbol.getChar() + "), enter your move (row,col): ");

     String input = scanner.nextLine().trim();
     
     String[] parts = input.split(",");

     int row = Integer.parseInt(parts[0].trim());
     int col = Integer.parseInt(parts[1].trim());

     return new int[]{row,col};
   }
}
