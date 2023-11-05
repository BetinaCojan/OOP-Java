package lab5.task1;
import java.util.Random;

public class RandomOutTask implements Task {
    private static Random rand = new Random(12345);
    private int randomNumber;

    public RandomOutTask() {
        randomNumber = rand.nextInt();
    }

    @Override
    public void execute() {
        randomNumber = rand.nextInt();
        System.out.println("Random number generated: " + randomNumber);
    }
}
