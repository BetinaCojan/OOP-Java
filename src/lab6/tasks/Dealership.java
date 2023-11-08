package lab6.tasks;

import java.util.Random;

public class Dealership {
    private int discount;

    int getFinalPrice(Car car) {
        int totalDiscount;

        BrandOffer brandOffer = new BrandOffer();
        DealerOffer dealerOffer = new DealerOffer();
        SpecialOffer specialOffer = new SpecialOffer();

        int brandDiscount = brandOffer.getDiscount(car);
        int dealerDiscount = dealerOffer.getDiscount(car);
        int specialdiscount = specialOffer.getDiscount(car);

        totalDiscount = brandDiscount + dealerDiscount + specialdiscount;

        car.price -= totalDiscount * car.price / 100;
        return car.price;
    }

    private class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            switch (car.carType) {
                case Mercedes:
                    discount = 5;
                    System.out.println("Applying Brand discount: " + discount + " euros");
                    break;
                case Fiat:
                    discount = 10;
                    System.out.println("Applying Brand discount: " + discount + " euros");
                    break;
                case Skoda:
                    discount = 15;
                    System.out.println("Applying Brand discount: " + discount + " euros");
                    break;
            }
            return discount;
        }
    }

    private class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int age = 2023 - car.getYear();
            switch (car.carType) {
                case Mercedes -> discount = age * 300;
                case Fiat -> discount = age * 100;
                case Skoda -> discount = age * 150;
            }
            return discount;
        }
    }

    private class SpecialOffer implements Offer {
        SpecialOffer() {
            Random rand = new Random(20);
            discount = rand.nextInt(1001);
            System.out.println("Applying Dealer discount: " + discount + " euros");
        }

        @Override
        public int getDiscount(Car car) {
            return discount;
        }
    }

    void negotiate(Car car, Offer offer) {
        int customerDiscount = offer.getDiscount(car);
        System.out.println("Customer offers a discount of " + customerDiscount + " euros");

        int finalPrice = getFinalPrice(car);

        if (customerDiscount <= 0 || customerDiscount >= finalPrice) {
            System.out.println("Negotiation failed. Customer's discount is not valid.");
        } else {
            car.price -= customerDiscount;
            System.out.println("Negotiation successful. New price after customer's discount: " + car.price + " euros");
        }
    }
}
    class Test {
        public static void main(String[] args) {
            Car mercedes1 = new Car(20000, Car.CarType.Mercedes, 2010);
            Car mercedes2 = new Car(35000, Car.CarType.Mercedes, 2015);

            Car fiat1 = new Car(3500, Car.CarType.Fiat, 2008);
            Car fiat2 = new Car(7000, Car.CarType.Fiat, 2010);

            Car skoda1 = new Car(12000, Car.CarType.Skoda, 2015);
            Car skod2 = new Car(25000, Car.CarType.Skoda, 2021);

            Dealership dealership = new Dealership();
/*
            int mercedes1Price = dealership.getFinalPrice(mercedes1);
            int mercedes2Price = dealership.getFinalPrice(mercedes2);

            int skoda1Price = dealership.getFinalPrice(skoda1);
            int skoda2Price = dealership.getFinalPrice(skod2);

            int fiat1Price = dealership.getFinalPrice(fiat1);
            int fiat2Price = dealership.getFinalPrice(fiat2);*/

            System.out.println(dealership.getFinalPrice(mercedes1));
            System.out.println(dealership.getFinalPrice(mercedes2));

            System.out.println(dealership.getFinalPrice(fiat1));
            System.out.println(dealership.getFinalPrice(fiat2));

            System.out.println(dealership.getFinalPrice(skoda1));
            System.out.println(dealership.getFinalPrice(skod2));
        }
    }

