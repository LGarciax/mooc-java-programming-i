
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.parseInt(parts[1]);

            if (value < 1) {
                continue;
            }

            if (command.equalsIgnoreCase("add")) {
                if (firstContainer + value <= 100) {
                    firstContainer += value;
                } else {
                    firstContainer = 100;
                }
            }

            if (command.equalsIgnoreCase("move")) {
                if (value > firstContainer) {
                    secondContainer += firstContainer;
                } else {
                    secondContainer += value;
                    firstContainer -= value;
                }
            }

            if (command.equalsIgnoreCase("remove")) {
                if (secondContainer - value >= 0) {
                    secondContainer -= value;
                }
            }

            if (secondContainer > 100) {
                secondContainer = 100;
            }
        }

    }

}
        

    


