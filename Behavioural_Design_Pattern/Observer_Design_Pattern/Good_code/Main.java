package Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code;

import Behavioural_Design_Pattern.Observer_Design_Pattern.Good_code.YouTubeSubscriber;;

public class Main {
    YouTubeChannelImpl channel=new YouTubeChannelImpl();

    YouTubeSubscriber alice=new YouTubeSubscriber("Alice");
    YouTubeSubscriber bob=new YouTubeSubcriber("Bob");

    channel.add(alice);
    channel.add(bob);
    channel.uploadNewVideos(" this is first new uploaded videos");
    channel.remove(alice);
    channel.uploadNewVideos(" this is second new uploaded videos");
    
}
