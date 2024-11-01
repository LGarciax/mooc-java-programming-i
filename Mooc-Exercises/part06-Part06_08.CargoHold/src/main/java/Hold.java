
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holdItems;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        holdItems = new ArrayList<>();
    }

    public void addSuitcase (Suitcase suitcase){ 
        int Weight = this.totalWeight();
        
        if(Weight + suitcase.totalWeight() <= maxWeight){
            holdItems.add(suitcase);
            
        }
        
        
    }

    public int totalWeight(){
        int currentWeight = 0;
        for(Suitcase suitcase: holdItems){
            currentWeight += suitcase.totalWeight();
        }
        return currentWeight;
    }

    public void printItems(){
        for(Suitcase suit : holdItems){
            suit.printItems();
        }
    }

    @Override
    public String toString(){
        if(this.holdItems.isEmpty()){
            return "no suitcases (0 kg)";
        }
        if(this.holdItems.size() == 1){
            return "1 suitcase (" + this.totalWeight() +" kg)";
        }
        return this.holdItems.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}

