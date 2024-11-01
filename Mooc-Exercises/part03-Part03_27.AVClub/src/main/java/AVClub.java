
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String frase = scanner.nextLine();
            String[] pedaco = frase.split(" ");
            if(frase.equals("")){
                break;
            }
            for(String i : pedaco){
                if(i.contains("av")){
                    System.out.println(i);
                }
            }
            
        }


    }
}
