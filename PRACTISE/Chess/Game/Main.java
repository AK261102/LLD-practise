package PRACTISE.Chess.Game;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Ashish", true);
        Player p2= new Player("Priya", false);
        ChessGame game = new ChessGame(p1,p2);
        game.start();
    }
}
