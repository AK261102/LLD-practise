package Structural

import java.util.HashMap;

-Design-Patterns.Proxy Design Pattern.Good Code;

public class ProxyVideoService implements VideoServiceInterface {
    public RealVideoService realVideoService;
    public HashMap<String,String> cachedVideos=new HashMap<>();
    public HashMap<String,Integer> requestCount=new HashMap<>();
    public ProxyVideoService(RealVideoService realVideoService)
    {
        this.realVideoService=realVideoService;
    }

    @Override
    public void playVideos(String userName,String videoName)
    {
        if(!userName.contains("Premium") && videoName.startsWith("Premium"))
        {
            System.out.println("Access Denied, as this videos is only for the premium users");
            return;
        }
        requestCount.put(userName,realVideoService.getOrDefault(userType, 0) + 1);
        if(requestCount.count(userName)>1)
        {
            System.out.println("Access denied due to large requests");
            return;
        }
        if(cachedVideos.containsKey(videoName))
        {
            System.out.println("This video is already has been cached ");
        }
        else
        {
            realVideoService.playVideos(userName,videoName);
            cachedVideos(userName,videoName);
        }
    }
}
