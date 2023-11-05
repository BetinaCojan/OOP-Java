package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Queue extends ContainerCommonBehavior {
    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public Task pop() {
        if (tasks.isEmpty()) {
            return null;
        } else {
            Task removedItem = tasks.get(0);
            tasks.remove(0);
            return removedItem;
        }
    }

    @Override
    public void transferFrom(Container container) {
        if (container instanceof Queue) {
            Queue sourceQueue = (Queue) container;
            int sourceSize = sourceQueue.size();

            for (int i = 0; i < sourceSize; i ++) {
                Task task = sourceQueue.pop();
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
