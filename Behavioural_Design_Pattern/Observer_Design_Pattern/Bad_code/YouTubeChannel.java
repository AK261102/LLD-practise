package Behavioural_Design_Pattern.Observer_Design_Pattern.Bad_code;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel{

    private List<String> subscribers=new ArrayList<>();
    private String video;

    public void addSubscriber(String subscriber)
    {
        subscribers.add(subscriber);
    }

    public void uploadNewVideos(String videos)
    {
        this.videos=videos;
        notifySubsriber();
    }

    public void notifySubsriber()
    {
        for(String it:subscribers)
        {
            System.out.println("Notifying the people"+subscribers+"about the video"+video);
            sendEmail(it);
        }
    }

    public String sendEmail(String subscriber)
    {
        System.out.println("Sending this email to "+ subscriber);
    }

    public void getVideo()
    {
        return video;
    }
}