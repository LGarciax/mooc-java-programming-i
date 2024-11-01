
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics soma = new Statistics();
        Statistics even = new Statistics();
        Statistics odds = new Statistics();

        System.out.println("Enter numbers:");
        
        while(true){
            int i = scanner.nextInt();
            if(i == -1){
                break;
            }    
            soma.addNumber(i); 
            if(i%2 == 0){
                even.addNumber(i);
            }else{
                odds.addNumber(i);
            }     
        }

        System.out.println("Sum: " + soma.sum());
        System.out.println("Sum of the even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odds.sum());
    }
}
