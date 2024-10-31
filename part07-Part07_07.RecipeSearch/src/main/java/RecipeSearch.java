import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeList recipes = new RecipeList();

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        try(Scanner filScanner = new Scanner(Paths.get(file))){
            while(filScanner.hasNextLine()){
                String name = filScanner.nextLine();
                int time = Integer.valueOf(filScanner.nextLine());
                Recipe recipe = new Recipe(name, time);
                while(filScanner.hasNextLine()){
                    String ingredient = filScanner.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
                recipes.addRecipe(recipe);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while(true){
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                recipes.printRecipes();
            }
            if(command.equals("find name")){
                System.out.println("Name: ");
                String name = scanner.nextLine();
               ArrayList<Recipe> foundRecipes = recipes.findByName(name);
                for (Recipe recipe : foundRecipes) {
                    System.out.println(recipe);
                }
            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                recipes.findCookingTime(maxCookingTime);
            }
            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipes.findRecipe(ingredient);
            }
        }


    }

}
