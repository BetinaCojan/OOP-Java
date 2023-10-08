package lab2.task3;

public class Point {
    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void changeCoords(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    // first method to show number
    void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

    // second method to show number - Overriding toString()
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")" ;
    }
}
