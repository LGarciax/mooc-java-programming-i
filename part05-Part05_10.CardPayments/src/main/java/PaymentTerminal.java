


public class PaymentTerminal {
    private static final double EAT_AFFORDABLY = 2.50;
    private static final double EAT_HEARTILY = 4.30;

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        

        if(payment < EAT_AFFORDABLY){
            
            return payment;
        }

        money += EAT_AFFORDABLY;
        this.affordableMeals++;

        return payment - EAT_AFFORDABLY;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment < EAT_HEARTILY){
            return payment;
        }

        money += EAT_HEARTILY;
        this.heartyMeals++;

        return payment - EAT_HEARTILY;
    }

    public boolean eatAffordably(PaymentCard card){

        if(card.balance() >= EAT_AFFORDABLY){
            card.takeMoney(EAT_AFFORDABLY);
            this.affordableMeals++;
            return true;
        }


        return false;
    }

    public boolean eatHeartily(PaymentCard card){

        if(card.balance() >= EAT_HEARTILY){
            card.takeMoney(EAT_HEARTILY);
            this.heartyMeals++;
            return true;
        }


        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        
        if(sum < 0){
            return;
        }
        
        card.addMoney(sum);
        this.money += sum;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
