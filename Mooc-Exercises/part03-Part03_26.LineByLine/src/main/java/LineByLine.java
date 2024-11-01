
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){ 

            
            String frase = scanner.nextLine();
            
            if(frase.equals("")){
                break;
            }


            String[] pedaco = frase.split(" ");
            
            for(int i = 0; i < pedaco.length; i++){
                System.out.println(pedaco[i]);
            }
         
            if(frase.equals("")){
                break;
            }
        }

    }
}
