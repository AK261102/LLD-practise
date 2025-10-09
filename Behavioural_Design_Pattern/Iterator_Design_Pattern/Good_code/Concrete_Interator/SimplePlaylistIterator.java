package Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code.Concrete_Interator;

import java.util.ArrayList;

import Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Playlist;

public class SimplePlaylistIterator implements PlaylistIterator{
    public Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code.Playlist playlist;
    public int idx=0;

    public SimplePlaylistIterator()
    {
        this.playlist=playlist;
        this.idx=idx;
    }
    @Override
    public boolean hasNext()
    {
        return idx<playlist.getSongs.size();
    }

    @Override
    public String next()
    {
        return playlist.get(idx)++;
    }
    
}
