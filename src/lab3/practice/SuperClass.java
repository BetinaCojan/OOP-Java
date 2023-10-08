package lab3.practice;

public class SuperClass {

    public SuperClass() {
        System.out.println("Printed in Superclass constructor with no args.");
    }

    public SuperClass(int a) {
        System.out.println("Printed in Superclass constructor with one integer argument.");
    }
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}