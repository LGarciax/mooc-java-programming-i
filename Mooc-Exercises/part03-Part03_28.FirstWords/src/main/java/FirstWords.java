
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){ 
            String line = scanner.nextLine();
            String[] first = line.split(" ");

            if(line.equals("")){
                break;
            }
            System.out.println(first[0]);
        }



    }
}
