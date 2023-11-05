package lab5.practice;

public interface Instrument {
    // Compile-time constant:
    int FIELD = 5; // static & final

    // Cannot have method definitions:
    void play(); // Automatically public

    String what();

    void adjust();
}

class WindInstrument implements Instrument {

    public void play() {
        System.out.println("WindInstrument.play()");
    }

    public String what() {
        return "WindInstrument";
    }

    public void adjust() {
    }
}

class Trumpet extends WindInstrument {

    public void play() {
        System.out.println("Trumpet.play()");
    }

    public void adjust() {
        System.out.println("Trumpet.adjust()");
    }
}

