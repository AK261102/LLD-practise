package Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.Interfaces;

public interface YouTubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubsriber();
}
