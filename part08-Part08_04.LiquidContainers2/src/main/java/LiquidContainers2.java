
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] aInput = input.split(" ");
            String command = aInput[0];
            int number = Integer.parseInt(aInput[1]);

            if (command.equals("add")) {
                first.add(number);
            }

            if (command.equals("move")) {
                if (first.contains() < number) {
                    number = first.contains();
                }
                first.remove(number);
                second.add(number);
            }

            if (command.equals("remove")) {
                second.remove(number);
            }

        }
    }

}
