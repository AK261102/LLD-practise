package Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code.Concrete_Interator;

import Behavioural_Design_Pattern.Iterator_Design_Pattern.Bad_code.Playlist;

public class FavoritesPlaylistIterator implements PlaylistIterator {
    private Playlist playlist
    private int idx;
    public FavoritesPlaylistIterator(Playlist playlist)
    {
        this.playlist=playlist;
        this.idx=0;
    }
    @Override
    public boolean hasNext(){
        while(idx<playlist.getSongs.size())
        {
            if(playlist.getSongs().get(index).contains("fav"))
            return true;
            idx++;
        }
        
        return false
    }
    @Override
public String next(){
    return playlist.getSongs().get(idx++);
}

}

