package lab5.task4;

import java.util.Objects;

public class ThrillerAlbum extends Album {

    @Override
    public void addSong(Song song) {
        if ((Objects.equals(song.composer, "Michael Jackson")) && (song.ID % 2 == 0)) {
            songs.add(song);
            System.out.println("Song added to the ThrillerAlbum");
        } else {
            System.out.println("It's not accepted in the thriller album");
        }
    }
}
