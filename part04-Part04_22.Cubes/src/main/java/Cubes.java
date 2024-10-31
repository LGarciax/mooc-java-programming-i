
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){ 
            String entry = scanner.nextLine();
            if(entry.contentEquals("end")){
                break;
            }

            int number = Integer.valueOf(entry);

            System.out.println(number*number*number);
        }

    }
}
