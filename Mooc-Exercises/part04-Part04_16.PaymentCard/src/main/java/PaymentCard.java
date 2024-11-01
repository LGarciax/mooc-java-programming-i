public class PaymentCard {
    
    private double balance;

    public PaymentCard(double openingBalance){

        this.balance = openingBalance;

    }

    public void eatAffordably(){
        if(this.balance - 2.60 < 0){
            return;
        }
        this.balance -= 2.60;
        
    }

    public void eatHeartily(){
        if(this.balance - 4.60 < 0){
            return;
        }
        this.balance -= 4.60;

    }
    
    public void addMoney(double money){

        if(money < 0){
            return;
        }


        if(this.balance + money > 150){
            this.balance = 150;           
        }else{
            this.balance += money;
        }
    }

    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }



}
