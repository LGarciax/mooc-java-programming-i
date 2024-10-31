
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner data = new Scanner(Paths.get(file))){

            while(data.hasNextLine()){ 

                String dataToSplit = data.nextLine();
                String[] line = dataToSplit.split(",");
                String name = line[0];
                int age = Integer.valueOf(line[1]);
                
                if(age == 1){ 
                    System.out.println(name + ", age: " + age + " year");
                }else { 
                    System.out.println(name + ", age: " + age + " years");
                }

            }

        } catch(Exception e){ 
            System.out.println("Error: " + e.getMessage());
        }

    }
}
