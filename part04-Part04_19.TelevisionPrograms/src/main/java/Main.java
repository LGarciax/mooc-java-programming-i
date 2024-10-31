import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){ 
            System.out.println("Name:");
            
            String newProgram = scanner.nextLine();
            
            if(newProgram.isEmpty()){ 
                break;
            }

            System.out.println("Duration:");
            int newDuration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(newProgram, newDuration));

        }

        System.out.println("Program's maximum duration?");
        int maxDuration = scanner.nextInt();

        for(TelevisionProgram program: programs){

            if(maxDuration >= program.getDuration()){
                System.out.println(program);

            }
        }
        

    }
}
