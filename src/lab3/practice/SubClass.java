package lab3.practice;

public class SubClass extends SuperClass {
    public SubClass() {
        super();    // apelează constructorul părinte

        System.out.println("Printed in Subclass constructor with no args.");
    }

    public SubClass(int a) {
        super(a);   // apelează constructorul părinte

        System.out.println("Printed in Subclass constructor with one integer argument.");
    }

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();  // apelează metoda părinte

        System.out.println("Printed in Subclass.");
    }

    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();

        System.out.println('\n');

        SubClass s1 = new SubClass(20);
        SubClass s2 = new SubClass();
    }
}