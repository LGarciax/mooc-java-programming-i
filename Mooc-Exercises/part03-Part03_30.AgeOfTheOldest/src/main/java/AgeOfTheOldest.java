
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while(true){
            String csv = scanner.nextLine();
            String[] age = csv.split(",");

            if(csv.equals("")){
                break;
            }

            int getAge = Integer.valueOf(age[1]);
            if(getAge > oldest){
                oldest = getAge;
            }

        }

        System.out.println("Age of the oldest: " + oldest);


    }
}
