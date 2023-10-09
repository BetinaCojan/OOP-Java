package lab3.task6;
import lab3.task1.Baravelli;
import lab3.task1.CandyBox;
import lab3.task1.ChocAmor;
import lab3.task1.Lindt;

import java.util.ArrayList;

public class Area {
    CandyBox candyBox;
    int number;
    String street;
    String message;

    public Area() {
        this.candyBox = new CandyBox();
        this.number = 0;
        this.street = "nowhere";
        this.message = "";
    }

    public Area(CandyBox candyBox, int number, String street, String message) {
        this.candyBox = candyBox;
        this.number = number;
        this.street = street;
        this.message = message;
    }

    public void getBirthdayCard() {
        System.out.println("Address is: " + this.street + ", number: " + this.number + '\n');
        System.out.println(this.message + '\n');
    }

    public void printCandyBoxDetails() {
        if (candyBox instanceof Lindt) {
            ((Lindt) candyBox).printLindtDim();
        } else if (candyBox instanceof Baravelli) {
            ((Baravelli) candyBox).printBaravelliDim();
        } else if (candyBox instanceof ChocAmor) {
            ((ChocAmor) candyBox).printChocAmorDim();
        }
    }
}