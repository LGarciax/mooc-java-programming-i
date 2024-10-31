

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        while(true){

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.contentEquals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.contentEquals("")){
               break;
            }
            Product product = new Product(name, identifier);

            if(!(products.contains(product))){
                products.add(product);
            }
            

        }

        System.out.println("==Items==");

        for(Product product: products){
            System.out.println(product);
        }






    }
}
