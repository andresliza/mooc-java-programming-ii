
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type \"end\"  to stop");
        List<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }

        double average = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);

    }
}
