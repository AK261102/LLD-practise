package QUESTIONS.TicTaeToe_Me;

import QUESTIONS.TicTaeToe_Me.Controller.LetsPlay;

public class Main {
    public static void main(String[] args) {
        Player p1=new Player(p1,'X');
        Player p2=new Player(p2,'O');
        LetsPlayGame(p1,p2);
    }
}
