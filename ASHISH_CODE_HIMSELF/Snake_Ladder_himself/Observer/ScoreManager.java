package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreManager {
    private int score;
    private List<ScoreObserver> observers;

    public ScoreManager()
    {
        this.score=0;
        this.observers=new ArrayList<>();
    }

    public void addObserver(ScoreObserver obs)
    {
        observers.add(obs);
    }

    public void removeObserver(ScoreObserver obs)
    {
        observers.remove(obs);
    }

    public void addScore(int points, String reason)
    {
        int oldScore=this.score;
        this.score+=points;
        notifyAll(oldScore,this.score,reason);
    }

    public void notifyAll(int oldScore,int newScore,String reason)
    {
        for(ScoreObserver obs:observers)
        {
            obs.onScoreUpdate(oldScore, newScore, reason);
        }
    }
    public int getScore() { return score; }
}
