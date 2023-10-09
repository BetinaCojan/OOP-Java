package lab3.task1;

public class ChocAmor extends CandyBox {
    float length;

    public ChocAmor() {
        this.length = 0.0F;
    }

    public ChocAmor(String flavor, String origin) {
        super(flavor, origin);
    }

    public ChocAmor(String flavor, String origin, float length) {
        this.flavor = flavor;
        this.origin = origin;
        this.length = length;
    }

    public void setVolume(float length) {
        this.length = length;
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor dimensions (length: " + this.length + ")");
    }

    @Override
    public String printBoxDim() {
        return "ChocAmor dimensions (length: " + this.length + ")";
    }

    @Override
    public float getVolume() {
        return (float) Math.pow(this.length, 3);
    }

    @Override
    public String toString() {
        return "ChocAmor - " + "The " + this.flavor + " " + this.origin + " chocolate";
    }
}
