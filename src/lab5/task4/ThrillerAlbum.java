package lab5.task4;

import java.util.ArrayList;
import java.util.Objects;

public class ThrillerAlbum extends Album {
    ArrayList<Song> songs = new ArrayList<>();

    @Override
    public void addSong(Song song) {
        if ((Objects.equals(song.composer, "Michael Jackson")) && (song.ID % 2 == 0)) {
            songs.add(song);
        } else {
            System.out.println("It's not accepted in the thriller album");
        }
    }
}
