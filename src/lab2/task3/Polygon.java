package lab2.task3;

public class Polygon {
    Point[] points;

    public Polygon(int numPoints) {
        points = new Point[numPoints];
    }

    public Polygon(float[] coords) {
        this(coords.length / 2);

        for (int i = 0; i < coords.length; i+= 2) {
            points[i / 2] = new Point(coords[i], coords[i + 1]);
        }
    }
}
