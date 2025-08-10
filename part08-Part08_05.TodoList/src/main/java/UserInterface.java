import java.util.Scanner;

public class UserInterface {

    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.tasks.add(task);
            } else if (command.equals("list")) {
                this.tasks.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int task = Integer.valueOf(this.scanner.nextLine());
                this.tasks.remove(task);
            } else {
                continue;
            }
        }

    }
}
