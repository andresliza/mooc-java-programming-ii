
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int amount = 0;

        while (true) {
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);

            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            }

            amount++;
            sum += number;
        }

        if (amount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / amount);
        }
    }
}
