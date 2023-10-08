package lab3.task1;

public class CandyBox {
    String flavor;
    String origin;

    public CandyBox() {
        this.flavor = "sugar-free";
        this.origin = "Switzerland";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + this.flavor + " " + this.origin + " chocolate";
    }

    public static void main(String[] args) {
        CandyBox candy1 = new CandyBox("sweet", "Germany");
        CandyBox candy2 = new CandyBox();

        candy1.getVolume();
        candy2.getVolume();

        System.out.println(candy1);
        System.out.println(candy2);
    }
}
