
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){ 
        if(this.meals.contains(meal)){
            return;
        }
        this.meals.add(meal);
    }

    public void printMeals(){
        for(String meal : meals){ 
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        int fixedListSize = this.meals.size();
        for (int i = 0; i < fixedListSize; i++) {
            meals.remove(0);
        }
    }
}
