package lab5.task4;

public class BadAlbum extends Album {

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
        if (isPalindrome(song.getID()) && song.getName().length() == 3) {
            songs.add(song);
            System.out.println("Song added to the BadAlbum");
        } else {
            System.out.println("Song is not accepted in the BadAlbum");
        }
    }
}
