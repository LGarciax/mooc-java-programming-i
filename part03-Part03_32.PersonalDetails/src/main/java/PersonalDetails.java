
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameSize = 0, count = 0, average = 0;
        String longName = ""; 
        while(true){ 
            String csv = scanner.nextLine();
            String[] birthStrings = csv.split(",");

            if(csv.equals("")){ 
                break;
            }  
            if(birthStrings[0].length() > nameSize){
                longName = birthStrings[0];
                nameSize = birthStrings[0].length();
            }
            average = average + Integer.valueOf(birthStrings[1]);
            count++;

        }

        System.out.println(longName);
        System.out.println((double) average / count );


    }
}
