package Structural-Design-Patterns.Proxy Design Pattern.Good Code.Client_Code;

public class Main {
    public static void main(String[] args) {
        RealVideoService realVideoService=new RealVideoService();
        ProxyVideoService proxyVideoService=new ProxyVideoService(realVideoService);
        proxyVideoService.playVideos("free","Playing video1");
        proxyVideoService.playVideos("premium","Playing premium videos");
    }
}
