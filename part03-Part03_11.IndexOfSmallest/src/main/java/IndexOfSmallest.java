
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numbersList = new ArrayList<>();
        while(true){ 
            int number = scanner.nextInt();
            if(number == 9999){ 
                break;
            }
            numbersList.add(number);
        }

        int smallest = 9999;

        for(int i = 0; i < numbersList.size(); i++){
            if(smallest > numbersList.get(i)){
                smallest = numbersList.get(i);
            }
        }

        System.out.println("Smallest number: " + smallest);

        ArrayList<Integer> small = new ArrayList<>();

        for(int i = 0; i < numbersList.size(); i++){
            if(smallest == numbersList.get(i)){
                small.add(i);
            }
        }

        for(int index : small){
            System.out.println("Found at index: " + index);
        }

        
    }
}
