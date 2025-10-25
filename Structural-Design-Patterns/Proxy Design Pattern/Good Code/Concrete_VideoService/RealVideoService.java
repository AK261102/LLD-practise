package Structural-Design-Patterns.Proxy Design Pattern.Good Code.Concrete_VideoService;

public class RealVideoService implements VideoServiceInterface {
    @Override
    public void playVideos(String userName,String videoName)
    {
        System.out.println("This is the video that i am playing :"+videoName);
    }
}
