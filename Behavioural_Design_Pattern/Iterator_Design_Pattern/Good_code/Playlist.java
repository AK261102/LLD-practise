package Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code;

import java.util.ArrayList;

import Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code.Concrete_Interator.FavoritesPlaylistIterator;
import Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code.Concrete_Interator.ShuffledPlaylistIterator;
import Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code.Concrete_Interator.SimplePlaylistIterator;

public class Playlist {
    private ArrayList<String> songs;

    void Playlist()
    {
        this.song=new ArrayList<>();
    }

    public void addSongs(String song)
    {
        songs.add(song);
    }

     public PlaylistIterator iterator(String type) {
        switch (type) {
            case "simple":
                return new SimplePlaylistIterator(this);
            case "shuffled":
                return new ShuffledPlaylistIterator(this);
            case "favorites":
                return new FavoritesPlaylistIterator(this);
            default:
                return null;
        }
    }
    public ArrayList<String> getSongs{
        return songs;
    }
}
