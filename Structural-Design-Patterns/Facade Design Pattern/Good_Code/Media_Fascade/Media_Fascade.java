package Structural-Design-Patterns.Facade Design Pattern.Good_Code.Media_Fascade;

public class Media_Fascade {
    public ImageViewer;
    public MusicPlayer;
    public VideoPlayer;
    public Media_Fascade()
    {
        this.ImageViewer=ImageViewer();
        this.MusicPlayer=MusicPlayer();
        this.VideoPlayer=VideoPlayer();
    }
    public void performAction(String action)
    {
        if(action=="Image")
        {
            ImageViewer.displayImage();
            ImageViewer.loadImage();
        }
        else if(action=="video")
        {
            VideoPlayer.playVideo();
            VideoPlayer.stopVideo();
        }
        else if(action=="music")
        {
            MusicPlayer.playMusic();
            MusicPlayer.stopMusic();
        }
    }
}
