
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            inputs.add(input);
            
        }
        inputs.forEach(s -> System.out.println(s));
    }
}
