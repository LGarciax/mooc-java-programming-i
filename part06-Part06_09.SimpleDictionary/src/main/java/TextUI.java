import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true){ 
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.contentEquals("end")){
                break;
            }else if(command.contentEquals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }else if(command.contentEquals("search")){
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                String translate = this.dictionary.translate(word);

                if(translate == null){
                    System.out.println("Word " + word + " was not found");
                    
                }else { 
                
                System.out.println(translate);}

            }else{ 
                System.out.println("Unknown command");
            }



        }
        System.out.println("Bye bye!");
    }
}
