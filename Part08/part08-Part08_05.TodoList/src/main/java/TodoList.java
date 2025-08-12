import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();

    }

    public void add(String task) {
        this.tasks.add(task);
    }

    // We want to print all tasks, starting from 1 as the index.
    public void print() {
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println(i + 1 + ": " + this.tasks.get(i));
        }
    }

    // The number given is the one shown when priting, not the real index.
    public void remove(int number) {
        this.tasks.remove(number - 1);
    }

}
