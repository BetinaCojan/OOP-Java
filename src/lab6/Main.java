package lab6;

import lab6.tasks.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random(20);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();
        ArrayList<Car> cars = new ArrayList<>();

        switch(taskNum) {
            case 1:
                 Car mercedes = new Car(20000, Car.CarType.Mercedes, 2019);
                 Car fiat = new Car(7000, Car.CarType.Fiat, 2020);
                 Car skoda = new Car(12000, Car.CarType.Skoda, 2022);

                 Dealership dealership = new Dealership();

                 Car mercedes1 = new Car(30000, Car.CarType.Mercedes, 2019);
                 Car mercedes2 = new Car(50000, Car.CarType.Mercedes, 2021);

                 Car fiat1 = new Car(10000, Car.CarType.Fiat, 2018);

                 Car skoda1 = new Car(20000, Car.CarType.Skoda, 2019);

                 cars.add(mercedes1);
                 cars.add(mercedes2);
                 cars.add(fiat1);
                 cars.add(skoda1);

                System.out.println("Before:");
                 for( Car car : cars) {
                     System.out.println(car);
                 }

                 cars.removeIf(car -> car.getPrice() > 25000);

                System.out.println("\nAfter:");
                for( Car car : cars) {
                    System.out.println(car);
                }

                break;
            case 2:
                 dealership = new Dealership();
                break;
            case 3:
                 dealership = new Dealership();
                break;
            case 4:
                break;
        }
    }
}