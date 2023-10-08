package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    // Constructor with two parameters
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Constructor with no parameters
    public Complex() {
        this(0, 0);
    }

    // Copy Constructor
    public Complex(Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    void addWithComplex(Complex complex) {
        this.real += complex.real;
        this.imaginary += complex.imaginary;
    }

    void showNumber() {
        if (this.imaginary > 0) {
            System.out.println(this.real + " + i * " + this.imaginary);
        } else if (this.imaginary < 0) {
            System.out.println(this.real + " - i * " + (-this.imaginary));
        } else {
            System.out.println(this.real);
        }
    }

    // overriding the method toString()
    @Override
    public String toString() {
        if (imaginary > 0) {
            return "Complex number: " + real + " + " + imaginary + "i";
        } else if (imaginary < 0) {
            return "Complex number: " + real + " - " + (-imaginary) + "i";
        } else {
            return "Complex number: " + real;
        }
    }

}

    class TestComplex {
        public static void main(String[] args) {

            // use first constructor
            Complex c1 = new Complex(10, -5);

            // use second constructor
            Complex c2 = new Complex();
            c2.setReal(1);
            c2.setImaginary(2);

            // use third constructor named Copy Constructor
            Complex c3 = new Complex(c1);

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);

            c1.addWithComplex(c2);

            c1.showNumber();
            c2.showNumber();
            c3.showNumber();

        }
    }
