
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number?");
        int begin = scanner.nextInt();
        System.out.println("Last Number?");
        int end = scanner.nextInt();
        int soma = 0;
        for(int i = begin; i <= end; i++){
            soma += i;
        }
        System.out.println("The sum is " + soma);

    }
}
