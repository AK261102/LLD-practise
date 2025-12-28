package PRACTISE.File_System;

import java.nio.file.FileSystem;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        fs.createPath("/documents");
        fs.createPath("/documents/notes");
        fs.createPath("/documents/projects");
        fs.createPath("/pictures");
        fs.createPath("/musics");


        // Documents
        fs.createPath("/documents/notes/lld.md");
        fs.createPath("/documents/notes/hld.md");
        fs.createPath("/documents/notes/dsa.md");
        fs.createPath("/documents/projects/readme.txt");
        fs.createPath("/documents/resume.pdf");
        
        // Pictures
        fs.createPath("/pictures/photo1.jpg");
        fs.createPath("/pictures/photo2.png");
        
        // Music
        fs.createPath("/music/rock/song1.mp3");
        fs.createPath("/music/rock/song2.mp3");
        fs.createPath("/music/pop/track1.mp3");

        fs.display();

        fs.setFileContent("/documents/notes/lld.md","Hello LLD");

        String content = fs.getFileContent("/documents/notes/lld.md");
    }
}
