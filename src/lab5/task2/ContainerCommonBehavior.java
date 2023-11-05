package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public abstract class ContainerCommonBehavior implements Container {
    private ArrayList<Task> tasks = new ArrayList<>();
    @Override
    public void push(Task task) {
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    @Override
    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
