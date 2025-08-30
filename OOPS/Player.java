import java.util.*;
public class Player {
    String name;
    Player(String name){
        this.name=name;
    }
}

class Team{
    String teamName;

    List<Player>players=new ArrayList<>();
    Team(String teamName){
        this.teamName=teamName;
    }
    void addPlayer(Player player)
    {
        players.add(player);
    }
    void showteam()
    {
        for(Player p:players)
        {
            System.out.print(p.name);
        }
    }
}
class Main{
    public static void main(String[] args)
    {
        Team team=new Team("warriors");
        team.addPlayer(new Player("Ashish"));
        team.showteam();
    }
}
