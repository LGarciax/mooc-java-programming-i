import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    
    public Suitcase(int maxWeight){
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
        
    }

    public void addItem(Item item){ 
        int Weight = this.totalWeight();
        
        if(Weight + item.getWeight() <= maxWeight){
            items.add(item);
            
        }
        
    }

    public void printItems(){
         for(Item ite: items){
            System.out.println(ite);
         }
    }

    public int totalWeight(){
        int currentWeight = 0;
        for(Item ite: items){
            currentWeight += ite.getWeight();
        }
        return currentWeight;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);

        for(Item ite: items){
            if(heaviest.getWeight() < ite.getWeight()){
                heaviest = ite;
            }
        }
        return heaviest;
        
    }

    @Override
    public String toString(){
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        if(items.size() == 1){
            return "1 item (" + this.totalWeight() +" kg)";
        }
        return items.size() + " items (" + this.totalWeight() + " kg)";
    }

    
}
