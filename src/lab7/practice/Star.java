package lab7.practice;

public class Star {
    private int shininess;

    static void change(Star s, int newShine) {
        //s = new Star();
        s.shininess = newShine;
    }

    public static void main(String[] args) {
        Star star = new Star();
        System.out.print("Old shininess: " + star.shininess + "|");
        change(star, 10);
        System.out.println("New shininess: " + star.shininess);
    }
}

