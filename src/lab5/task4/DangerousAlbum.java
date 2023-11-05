package lab5.task4;

public class DangerousAlbum extends Album {

    @Override
    public void addSong(Song song) {
        if (isPrime(song.ID)) {
            songs.add(song);
            System.out.println("Song added to the dangerous album");
        } else {
            System.out.println("It's not accepted in the dangerous album");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
