package Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Concrete_Subscriber;

import Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Interfaces.Subscriber;

public class PushNotificationSubscriber implements Subscriber {
    private String userDevice;
    public PushNotificationSubscriber(){
        this.userDevice=userDevice;
    }

    @Override
    public void update(String video)
    {
        System.out.println(userDevice+"that's the notication coming"+video);
    }
}
