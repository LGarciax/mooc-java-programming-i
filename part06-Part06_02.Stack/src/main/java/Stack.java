import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stackList;

    public Stack(){
        this.stackList = new ArrayList<>();
    }

    public boolean isEmpty(){
        
        if(this.stackList.size() == 0){
            return true;
        }
        
        return false;
    }

    public void add(String value){ 
        this.stackList.add(value);
    }

    public ArrayList<String> values(){
        return this.stackList;
    }

    public String take(){
        String taken = this.stackList.get(stackList.size() - 1);
        this.stackList.remove(stackList.size() - 1);

        return taken;
    }




}
