package ASHISH_CODE_HIMSELF.Snake_Ladder_himself.Observer;

public class SoundNotifier {
    @Override
    public void onScoreUpdate(int oldScore,int newScore, String reason)
    {
        if(newScore>oldScore)
            System.out.println("Food eaten");
    }
}
