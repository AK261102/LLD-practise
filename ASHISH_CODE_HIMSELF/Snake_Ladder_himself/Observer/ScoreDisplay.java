package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Observer;

public class ScoreDisplay implements ScoreObserver {
    @Override
    public void onScoreUpdate(int oldScore,int newScore,String reason)
    {
          System.out.println("[DISPLAY] Score: " + oldScore + " -> " + newScore + " (" + reason + ")");
    }
}
