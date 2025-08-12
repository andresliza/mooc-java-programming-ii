
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int MAX = 100;
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("First: ");
            System.out.println(firstContainer + "/" + MAX);

            System.out.print("Second: ");
            System.out.println(secondContainer + "/" + MAX);

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                String[] split = input.split(" ");
                int amount = Integer.valueOf(split[1]);

                if (amount < 0)
                    amount = 0;

                if (firstContainer + amount > MAX) {
                    firstContainer = MAX;
                } else {
                    firstContainer += amount;
                }
            } else if (input.contains("remove")) {
                String[] split = input.split(" ");
                int amount = Integer.valueOf(split[1]);

                if (amount < 0)
                    amount = 0;

                if (secondContainer - amount < 0) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            } else if (input.contains("move")) {
                String[] split = input.split(" ");
                int amount = Integer.valueOf(split[1]);

                if (amount < 0)
                    amount = 0;

                if (firstContainer - amount < 0) {
                    amount = firstContainer;
                    firstContainer = 0;
                } else {
                    firstContainer -= amount;
                }

                if (secondContainer + amount > MAX) {
                    secondContainer = MAX;
                } else {
                    secondContainer += amount;
                }
            } else {
                continue;
            }
        }
    }
}
