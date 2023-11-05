package lab5.task4;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> songs = new ArrayList<>();

    abstract void addSong(Song song);

    void removeSong(Song song) {
        songs.remove(song);
    }

    public int getLenght() {
       return songs.size();
    }

    public String getNamesFromAlbum() {
        StringBuilder names = new StringBuilder();
        for (Song song : songs) {
            names.append(song.name).append(" ");
        }
        return names.toString();
    }

   /* public String toString () {
        return "Album{songs=[" + getNamesFromAlbum() + "]}";
    }*/

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Album{songs=[");
        for (Song song : songs) {
            builder.append(song.name).append(", ");
        }
        if (!songs.isEmpty()) {
            builder.delete(builder.length() - 2, builder.length());
        }
        builder.append("]}");
        return builder.toString();
    }
}
