package Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code.Concrete_Interator;

import java.util.ArrayList;
import java.util.Collection;

import Behavioural_Design_Pattern.Iterator_Design_Pattern.Bad_code.Playlist;

public class ShuffledPlaylistIterator implements PlaylistIterator {
    Playlist playlist;
    int idx=0;
    private ArrayList<String> shuffedPlaylist;
    public ShuffledPlaylistIterator()
    {
        this.playlist=playlist;
        this.shuffedPlaylist=shuffedPlaylist;
        Collection.shuffle(shuffedPlaylist);
        idx=0;
    }

    @Override
    boolean hasNext()
    {
        if(idx<shuffedPlaylist.size())
        return true;
    }

    @Override
    String next()
    {
        return  shuffedPlaylist.get(idx++);
    }


}
