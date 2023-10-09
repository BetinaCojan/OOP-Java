package lab3.task1;

public class Baravelli extends CandyBox {
    float radius;
    float height;

    public Baravelli() {
        this.height = 0.0F;
        this.radius = 0.0F;
    }

    public Baravelli(String flavor, String origin) {
        super(flavor, origin);
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        this.flavor = flavor;
        this.origin = origin;
        this.radius = radius;
        this.height = height;
    }

    public void setVolume(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli dimensions (radius: " + this.radius + ", height: " + this.height + ")");
    }
    @Override
    public String printBoxDim() {
        return "Baravelli dimensions (radius: " + this.radius +
                ", height: " + this.height + ")";
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * Math.pow(this.radius, 2) * this.height);
    }
    @Override
    public String toString() {
        return "Baravelli - " + "The " + this.flavor + " " + this.origin + " chocolate";
    }
}
