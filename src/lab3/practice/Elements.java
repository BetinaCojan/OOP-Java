package lab3.practice;
import java.util.ArrayList;
import java.util.Iterator;

public class Elements {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Sheep");

        System.out.println("First animal of the list is: " + animals.get(0));
        System.out.println("Number of animals from the list is: " + animals.size());

        animals.set(0, "Lion");
        System.out.println("First animal of the list is: " + animals.get(0));

        animals.remove(0);

        for (String animal : animals) {
            System.out.println(animal);
        }

        Iterator iterator = animals.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        animals.clear();

        System.out.println("Number of animals from the list is: " + animals.size());

    }
}
