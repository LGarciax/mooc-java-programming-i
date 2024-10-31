import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equalsIgnoreCase("add")) {
                firstContainer.add(amount);
            }

            if (command.equalsIgnoreCase("move")) {
                secondContainer.add(Math.min(firstContainer.contains(), amount));
                firstContainer.remove(amount);
            }

            if (command.equalsIgnoreCase("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}