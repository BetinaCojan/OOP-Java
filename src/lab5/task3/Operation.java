package lab5.task3;

public class Operation implements Minus, Plus, Mult, Div {

    float value;

    public Operation(float value) {
        this.value = value;
    }

    public float getNumber() {
        return value;
    }

    @Override
    public void div(float operand) {
        if (operand == 0) {
            System.out.println("Division by zero is not possible");
        } else {
            this.value /= operand;
        }
    }

    @Override
    public void minus(float operand) {
        this.value -= operand;
    }

    @Override
    public void mult(float operand) {
        this.value *= operand;
    }

    @Override
    public void plus(float operand) {
        this.value += operand;
    }
}
