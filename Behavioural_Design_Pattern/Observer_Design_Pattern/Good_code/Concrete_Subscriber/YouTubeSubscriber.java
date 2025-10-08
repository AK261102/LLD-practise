package Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Concrete_Subscriber;

import java.util.concurrent.Flow.Subscriber;
import Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Interfaces.Subscriber;;;;
public class YouTubeSubscriber implements Subscriber {
    private String email;
    void Subscriber(String email){
        this.email=email;
    }
    @Override
    public void update(String video)
    {
        System.out.println(video+"this is the subscriber"+email);
    }
}
