package lab6.practice;

class MyCar {
    class MyEngine {
        public void getFuelCap() {
            System.out.println("I am a generic Engine");
        }
    }
}

class MyOttoEngine extends MyCar.MyEngine {
    MyOttoEngine(MyCar myCar) {
        myCar.super(); // link to the outer class object
    }
}

public class InheritanceOfInnerClasses {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        MyOttoEngine myOttoEngine = new MyOttoEngine(myCar);
        myOttoEngine.getFuelCap();
    }
}
