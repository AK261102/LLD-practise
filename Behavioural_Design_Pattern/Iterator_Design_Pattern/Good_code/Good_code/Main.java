package Behavioural_Design_Pattern.Iterator_Design_Pattern.Good_code.Good_code;

public class Main {
    public static void main(String[] args) {
        Playlist playlist=new Playlist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2 Fav");
        playlist.addSong("Song 3");
        playlist.addSong("Song 4 Fav");
        playlist.addSong("Song 5");

        PlaylistIterator shuffledPlay=playlist.iterator("Shuffled");
        while(shuffledPlay.hasNext())
        {
            System.out.println("playing this shuffled ndfknbknkn");
        }

        PlaylistIterator favmera=playlist.iterator("favourites");
        while(favmera.hasNext())
        {
            System.out.println("playyyyyying");
        }

    }
}
