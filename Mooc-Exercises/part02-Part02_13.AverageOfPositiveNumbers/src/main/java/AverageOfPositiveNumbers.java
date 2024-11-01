
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0, soma = 0;
        while(true){ 
            double number = Double.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            }
            if (number > 0){
                soma = soma + number;
                count++;
            }
        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(soma/count);
        }
        


    }
}
