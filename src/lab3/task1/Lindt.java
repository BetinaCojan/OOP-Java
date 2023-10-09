package lab3.task1;

public class Lindt extends CandyBox {
    float length;
    float width;
    float height;

    public Lindt() {
        this.length = 0.0F;
        this.width = 0.0F;
        this.height = 0.0F;
    }

    public Lindt(String flavor, String origin) {
        super(flavor, origin);
    }

    public Lindt(String flavor, String origin,
                 float length, float width, float height) {
        this.flavor = flavor;
        this.origin = origin;
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public void setVolume(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void  printLindtDim() {
       System.out.println("Lindt dimensions (length: " + this.length + ", width: "
                + this.width + ", height: " + this.height + ")");
    }

    @Override
    public String printBoxDim() {
        return "Lindt dimensions (length: " + this.length + ", width: "
                + this.width + ", height: " + this.height + ")";
    }

    @Override
    public float getVolume() {
        return this.height * this.width * this.length;
    }

    @Override
    public String toString() {
        return "Lindt - " + "The " + this.flavor + " " + this.origin + " chocolate";
    }
}
