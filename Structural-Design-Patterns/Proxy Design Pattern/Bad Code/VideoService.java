package Structural

import java.util.HashMap;
import java.util.Map;

-Design-Patterns.Proxy Design Pattern.Bad Code;

public class VideoService {
    private Map<String, String> cachedVideos=new HashMap<>();
    private Map<String, Integer> requestCounts=new HashMap<>();
    public void playVideos(String userType,String videoName)
    {
        requestCounts.put(userType, requestCounts.getOrDefault(videoName, null));
        if(requestCounts.get(userType)>5)
        {
            System.out.println("Access denied user is sending a lot of request");
            return;
        }

        if(cachedVideos.containsKey(videoName))
        {
            System.out.println("This contains a cached videos");
        }
        else
        {
            System.out.println("Streaming new videos");
            cachedVideos.put(userType, videoName)
        }
    }
}
