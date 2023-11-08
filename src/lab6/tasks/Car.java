package lab6.tasks;

public class Car {
    int price;
    public enum CarType {
        Mercedes,
        Fiat,
        Skoda
    }
    CarType carType;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int year;

    public Car (int price, CarType carType, int year) {
        this.year = year;
        this.price = price;
        this.carType = carType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Car{price=" + this.price + ", carType=" + this.carType +
                ", year=" + this.year + "}";
    }
}
