package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Observer;

public interface ScoreObserver {

    void onScoreUpdate(int oldScore,int newScore, String reason);
}