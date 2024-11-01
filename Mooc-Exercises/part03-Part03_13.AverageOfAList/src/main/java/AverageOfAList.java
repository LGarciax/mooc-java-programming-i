
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> averageList = new ArrayList<>();
        
        while(true){ 
            int number = scanner.nextInt();
            if (number == -1){
                break;
            }
            averageList.add(number);
        }
        System.out.println("");

        int soma = 0;

        for(int x : averageList){
            soma += x;
        }

        System.out.println((double)soma / averageList.size());
        
    }
}
