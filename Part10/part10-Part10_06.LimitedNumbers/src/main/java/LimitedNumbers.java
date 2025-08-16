
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("-1")) {
                break;
            }

            inputs.add(input);
        }

        inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));
    }
}
