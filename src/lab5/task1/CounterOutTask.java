package lab5.task1;

public class CounterOutTask implements Task {
    private static int globalCounter = 0;

    @Override
    public void execute() {
        globalCounter++;
        System.out.println("Counter is now: " + globalCounter);
    }
}
