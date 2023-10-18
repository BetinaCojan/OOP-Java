package lab4.practice;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Alex", 5);
        grades.put("Ana", 8);
        grades.put("Bogdan", 9);
        grades.put("Marcel", 3);

        System.out.println("Marcel's grade: "+ grades.get("Marcel"));

        grades.put("Marcel", 10);
        System.out.println("Marcel's grade: "+ grades.get("Marcel"));

        for (Map.Entry<String, Integer> entry: grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}