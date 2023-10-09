package lab3.task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

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

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + this.flavor + " " + this.origin + " chocolate";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandyBox candyBox)) return false;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }

    public String printBoxDim() {
        return null;
    }

    public static void main(String[] args) {
        CandyBox candy1 = new CandyBox("sweet", "Germany");
        CandyBox candy2 = new CandyBox();

        candy1.getVolume();
        candy2.getVolume();

        System.out.println(candy1);
        System.out.println(candy2);
        System.out.println('\n');

        Lindt lindt = new Lindt("vanilla", "Romania");
        System.out.println(lindt);
        System.out.println("initial lindt volume: " + lindt.getVolume());
        lindt.setVolume(1, 2, 3);
        System.out.println(lindt);
        System.out.println("lindt volume: " + lindt.getVolume() + '\n');

        Baravelli baravelli = new Baravelli("dark", "South America");
        System.out.println(baravelli);
        System.out.println("initial baravelli volume: " + baravelli.getVolume());
        baravelli.setVolume(30, 5);
        System.out.println(baravelli);
        System.out.println("baravelli volume: " + baravelli.getVolume() + '\n');

        ChocAmor chocAmor = new ChocAmor("milk", "Colombia");
        System.out.println(chocAmor);
        System.out.println("initial chocAmor volume: " + chocAmor.getVolume());
        chocAmor.setVolume(7);
        System.out.println(chocAmor);
        System.out.println("chocAmor volume: " + chocAmor.getVolume() + '\n');

        Lindt lindt2 = new Lindt("vanilla", "Romania");
        lindt2.setVolume(1, 2, 3);
        System.out.println(lindt2.equals(lindt));   // true

        lindt2.setVolume(1, 2, 1);
        System.out.println(lindt2.equals(lindt));   // true

        lindt2.flavor = "dark";
        System.out.println(lindt2.equals(lindt));  // false
    }
}
