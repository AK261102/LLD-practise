package Structural

import java.util.Scanner;

import javax.swing.text.html.ImageView;

-Design-Patterns.Facade Design Pattern.Bad_Code;

public class MultiMedia {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value for the devices");
    String action=sc.nextLine();
    if(action=="Music")
    {
        MusicPlayer mp=new MusicPlayer();
        mp.playMusic();
        mp.stopMusic();
    }
    else if(action=="Video")
    {
        VideoPlayer vp=new VideoPlayer();
        vp.playVideo();
        vp.stopVideo();
    }
    else if(action=="image")
    {
        ImageView iv=new ImageView();
        iv.displayImage()
    }
}
