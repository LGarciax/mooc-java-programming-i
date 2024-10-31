import java.util.ArrayList;

public class RecipeList {
        
        private ArrayList<Recipe> recipes;
        
        public RecipeList() {
            this.recipes = new ArrayList<>();
        }
        
        public void addRecipe(Recipe recipe) {
            this.recipes.add(recipe);
        }
        
        public void printRecipes() {
            System.out.println("Recipes:");
            for (Recipe recipe : this.recipes) {
                System.out.println(recipe);
            }
        }
        
        public void findRecipe(String searchedWord) {
            System.out.println("Recipes:");
            for (Recipe recipe : this.recipes) {
                if (recipe.containsIngredient(searchedWord)) {
                    System.out.println(recipe);
                }
            }
        }
        
        public void findCookingTime(int maxCookingTime) {
            System.out.println("Recipes:");
            for (Recipe recipe : this.recipes) {
                if (recipe.getCookingTime() <= maxCookingTime) {
                    System.out.println(recipe);
                }
            }
        }
        
        public ArrayList<Recipe> findByName(String name) {
            ArrayList<Recipe> found = new ArrayList<>();
            for (Recipe recipe : this.recipes) {
                if (recipe.getName().contains(name)) {
                    found.add(recipe);
                }
            }
            return found;
        }
}
