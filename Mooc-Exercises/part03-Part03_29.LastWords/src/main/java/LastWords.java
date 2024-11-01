
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){ 
            String frase = scanner.nextLine();
            String[] last = frase.split(" ");
            if(frase.equals("")){
                break;
            }

            System.out.println(last[last.length-1]);
        }


    }
}
