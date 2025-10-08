package Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code;

import java.util.ArrayList;

import Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Interfaces.YouTubeChannel;

public class YouTubeChannelImpl implements YouTubeChannel{
    List<Subscriber> subscriber=new ArrayList<>();
    private String video;
    @Override
    public void addSubscriber(String subscriber)
    {
        subscriber.add(subscriber);
    }

    @Override
    public void removeSubscriber(String subscriber)
    {
        subscriber.remove(subscriber);
    }

    @Override
    public void notifySubsriber()
    {
        for(subscriber it:subscriber)
        {
            it.update(video);
        }
    }

    @Override
    public void uploadNewVideos(String video)
    {
        this.video=video;
        notifySubsriber();
    }
}
