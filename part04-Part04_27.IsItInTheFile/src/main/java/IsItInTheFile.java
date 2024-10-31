
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try(Scanner textFile = new Scanner(Paths.get(file))){

            boolean notFound = true;

            while(textFile.hasNextLine()){ 

                String message = textFile.nextLine();

                if(message.contains(searchedFor)){
                    System.out.println("Found!");
                    notFound = false;
                }  
                
            }
            if(notFound){
                System.out.println("Not found.");
            }


        } catch(Exception e){ 
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
