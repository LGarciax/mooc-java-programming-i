
public class Statistics {
    private int sum;
    private int count;
    

    public Statistics(){
        this.count = 0;
        this.sum = 0;
        
    }

    public void addNumber(int number){
        this.count++;
        this.sum = this.sum + number;
        
    }

    public int getCount(){
        return count;
    }

    public int sum(){
        return sum;
    }

    public double average(){
        if(this.count == 0){
            return 0;
        }
        return (double) this.sum / this.count;
    }
}
