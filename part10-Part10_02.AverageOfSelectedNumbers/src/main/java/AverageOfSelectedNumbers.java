
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList();
        String input;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();
        double avg = 0.0;
        if (input.equals("p")) {
            avg = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();
        }
        if (input.equals("n")) {
            avg = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();
        }
        System.out.println("Average of the negative numbers: " + avg);
    }
}
