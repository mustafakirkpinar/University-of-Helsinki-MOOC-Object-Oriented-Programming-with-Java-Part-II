
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList();
        int input;
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            inputs.add(input);
        }
        inputs.stream().filter(i -> i < 6 & i > 0).forEach(i -> System.out.println(i));
    }
}
