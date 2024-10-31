
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First name: ");
            String newFirstName = scanner.nextLine();

            if(newFirstName.isEmpty()){
                break;
            }
            System.out.println("Last name:");
            String newLastName = scanner.nextLine();

            System.out.println("Identification number:");
            String newIdentification = scanner.nextLine();

            infoCollection.add(new PersonalInformation(newFirstName, newLastName, newIdentification));

        }

        for(PersonalInformation person: infoCollection){ 
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
