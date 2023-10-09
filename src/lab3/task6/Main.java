package lab3.task6;

import lab3.task1.CandyBox;
import lab3.task1.Lindt;

public class Main {
    public static void main (String[] args) {
        CandyBox lindtBox = new Lindt("cherry", "Austria", 20F, 5.4F, 19.2F);
        Area area = new Area(lindtBox, 123, "Main St", "Happy Birthday!");

        area.getBirthdayCard();
        area.printCandyBoxDetails();
    }
}
