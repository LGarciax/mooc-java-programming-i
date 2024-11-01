
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while(true){
            String csv = scanner.nextLine();
            String[] old = csv.split(",");
            

            if(csv.equals("")){
                break;
            }

            for(int i = 0; i < old.length; i++){
                if(oldest < Integer.valueOf(old[1])){
                    oldest = Integer.valueOf(old[1]);
                    oldestName = old[0];

                }
            }


        }
        System.out.println(oldestName);


    }
}
