import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("First: ");
            System.out.println(first);
            System.out.print("Second: ");
            System.out.println(second);

            // Expected inputs are "quit", and "add"/"move"/"remove",
            // these three with the amount.
            String[] input = this.scanner.nextLine().split(" ");
            System.out.println();
            String command = input[0];

            if (command.equals("quit")) {
                break;
            }

            // We get the second element of the input array, which is the amount.
            int amount = Integer.valueOf(input[1]);

            // Adding adds to the first container, while removing does so from the second
            // one.
            // Moving takes liquid from the first container into the second one.
            if (command.startsWith("add")) {
                first.add(amount);
            } else if (command.startsWith("remove")) {
                second.remove(amount);
            } else if (command.startsWith("move")) {

                // We cannot add 20 liters to the second container if the first one only
                // contains 10.
                if (first.contains() < amount)
                    amount = first.contains();

                first.remove(amount);
                second.add(amount);
            } else {
                continue;
            }

        }

    }
}
