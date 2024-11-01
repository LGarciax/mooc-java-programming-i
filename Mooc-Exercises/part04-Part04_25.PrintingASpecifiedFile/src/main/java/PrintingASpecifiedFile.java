
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        try (Scanner filePath = new Scanner(Paths.get(file))) {
            while(filePath.hasNextLine()){
                String text = filePath.nextLine();
                System.out.println(text);
            }



        } catch (Exception e){ 
            System.out.println("Error: " + e.getMessage());
        }

    }
}
