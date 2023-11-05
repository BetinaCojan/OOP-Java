package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Stack extends ContainerCommonBehavior {
    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public Task pop() {
        if (tasks.isEmpty()) {
            return null;
        } else {
            Task currentTask = tasks.get(tasks.size() - 1);
            tasks.remove(tasks.size() - 1);
            return currentTask;
        }
    }

    @Override
    public void transferFrom(Container container) {
        if (container instanceof Stack) {
            Stack sourceStack = (Stack)container;

            int sourceSize = sourceStack.size();

            for (int i = 0; i < sourceSize; i ++) {
                Task task = sourceStack.pop();
                if (task != null) {
                    this.push(task);
                }
            }
        }
    }
    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

}
