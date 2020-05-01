
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.printf("First: %d/100%nSecond: %d/100%n", container1, container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                //System.out.printf("First: %d/100%n",container1);
                container1 += amount;
                if (container1 > 100) {
                    container1 = 100;
                }

            }

            if (command.equals("move") && amount > 0) {

                if (amount > container1) {
                    amount = container1;
                }

                container1 -= amount;
                container2 += amount;
                if (container2 > 100) {
                    container2 = 100;
                }
            }

            if (command.equals("remove") && amount > 0) {
                container2 -= amount;
                if (container2 < 0) {
                    container2 = 0;
                }
            }

        }

    }

}
