
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int soma = 0, count = 0, even = 0, odds = 0;

        System.out.println("Give numbers:");
        

        while (true) { 
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            if(number%2 == 0){
                even++;
            }else{
                odds++;
            }
            
            soma = number + soma;
            count++;
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + soma);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double)soma)/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odds);




    }
}
