package lab4.practice;

public class TestStaticBlock {
    static int staticInt;
    int objectFieldInt;

    static {
        staticInt = 10;
        System.out.println("static block called");
    }
}

class Main {
    public static void main(String[] args) {
        // Even though we didn't create an instance of the TestStaticBlock class,
        // the static block of code is executed, and the output will be 10
        System.out.println(TestStaticBlock.staticInt);
    }
}