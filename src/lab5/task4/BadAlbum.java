package lab5.task4;

import java.util.ArrayList;

public class BadAlbum extends Album {

    ArrayList<Song> songs = new ArrayList<>();

    boolean isPalindrome (int number) {
        int digit;
        int new_number = 0;
        int copy_number = number;

        while (copy_number > 0) {
            digit = copy_number % 10;
            new_number = new_number * 10 + digit;
            copy_number /= 10;
        }

        return new_number == number;
    }

    @Override
    public void addSong(Song song) {
        if (isPalindrome(song.ID) && (song.name.length() == 3))
            songs.add(song);
        else
            System.out.println("It's not accepted in the dab album");
    }
}
