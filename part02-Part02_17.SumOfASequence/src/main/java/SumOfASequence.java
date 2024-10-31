
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int end = scanner.nextInt();
        int soma = 0;
        for(int i = 1; i <= end; i++){
            soma += i;
        }
        System.out.println("The sum is " + soma);

    }
}
