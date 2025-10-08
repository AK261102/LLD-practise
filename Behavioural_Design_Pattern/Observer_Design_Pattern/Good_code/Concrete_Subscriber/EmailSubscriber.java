package Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Concrete_Subscriber;

import Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Interfaces.Subscriber;

public class EmailSubscriber implements Subscriber {
    private String email;
    public EmailSubscriber(String email)
    {
        this.email=email;
    }

    @Override
    public void update(String vides)
    {
        System.out.println(email+"this an email subscriber"+vides);
    }

}
