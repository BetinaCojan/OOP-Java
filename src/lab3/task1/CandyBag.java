package lab3.task1;
import java.util.ArrayList;

public class CandyBag extends CandyBox {
    ArrayList<CandyBox> bag = new ArrayList<>();

    public void addToBag(CandyBox candyBox) {
        bag.add(candyBox);
    }

    public void printElements() {
        for (CandyBox candyBox : this.bag) {
            System.out.println(candyBox);
        }
    }

    public static void main (String[] args) {
        CandyBag candyBag = new CandyBag(); // initialize bag with boxes

        // initialize boxes
        candyBag.addToBag(new Lindt("cherry", "Austria", 20F, 5.4F, 19.2F));
        candyBag.addToBag(new Lindt("apricot", "Austria",20F, 5.4F, 19.2F));
        candyBag.addToBag(new Lindt("strawberry", "Austria", 20F, 5.4F, 19.2F));

        candyBag.addToBag(new Baravelli("grape", "Italy", 6.7F, 8.7F));

        candyBag.addToBag(new ChocAmor("coffee", "France", 5.5F));
        candyBag.addToBag(new ChocAmor("vanilla", "France", 5.5F));

        System.out.println("The size of bag is: " + candyBag.bag.size());

        // first print
        for (CandyBox box : candyBag.bag) {
            System.out.println(box);
        }

        System.out.println('\n');

        // second print
        candyBag.printElements();

        System.out.println('\n');

        for (CandyBox box : candyBag.bag) {
            if (box instanceof Lindt) {
                ((Lindt) box).printLindtDim();
            }
            else if (box instanceof Baravelli) {
                ((Baravelli) box).printBaravelliDim();
            }
            else if (box instanceof ChocAmor) {
                ((ChocAmor) box).printChocAmorDim();
            }
        }

        System.out.println('\n');

        for (CandyBox box : candyBag.bag) {
            System.out.println(box.printBoxDim());
        }
    }
}
