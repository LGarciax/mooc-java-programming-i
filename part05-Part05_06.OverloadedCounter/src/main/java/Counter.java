public class Counter {

    private int value;

    public Counter(){
        this(0);
    }

    public Counter(int StartValue){
        this.value = StartValue;
    }

    public int value(){
        return value;
    }

    public void increase(){
        this.increase(1);;
    }

    public void increase(int number){
        if(number < 0){
            return;
        }
        this.value = this.value + number;
    }

    public void decrease(){
        this.decrease(1);
    }
    public void decrease(int number){
        if(number < 0){
            return;
        }
        this.value = this.value - number;
    }
    
}
