package Behavioural_Design_Pattern.Observer_Design_Pattern.Bad_code

public class YouTubeSubscriber{
    private String name;
    public YouTubeSubscriber(){
        this.name=name;
    }
    public void addSubscriber(YouTubeChannel channel){
        channel.addSubscriber(name);
    }
    public void watchYouTubeVideos(YouTubeSubscriber channel)
    {
        System.out.println("watching you tube videos"+channel.getClass());
    }
}