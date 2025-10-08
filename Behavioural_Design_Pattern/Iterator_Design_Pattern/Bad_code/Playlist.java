package Behavioural_Design_Pattern.Iterator_Design_Pattern.Bad_code;

import java.util.ArrayList;

public class Playlist {

        public ArrayList<String> songs;
        public void Playlist()
        {
            this.songs=songs;
        }
        public void addSongs(String song)
        {
            songs.add(song);
        }
        public void Playlist(boolean shuffle)
        {
            if(shuffle==true)
            {
                // your shuffing logic here
            }
            else{
                for(int i=0;i<songs.size();i++)
                {
                    // your song playing logic here
                }
            }
        }
}
