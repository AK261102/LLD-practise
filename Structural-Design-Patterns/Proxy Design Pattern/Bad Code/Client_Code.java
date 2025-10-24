package Structural-Design-Patterns.Proxy Design Pattern.Bad Code;

public class Client_Code {
    public static void main(String[] args) {
        VideoService vs = new VideoService();
        vs.playVideos("free","Free Videos 1");
        
    }
}
