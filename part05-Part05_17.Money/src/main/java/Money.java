
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){ 
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    public Money minus(Money decreaser){ 
        int newEuro;
        int newCents = this.cents;
        int currentEuros = this.euros;
        
        if(this.cents == 0 && decreaser.cents > 0){ 
            newCents = 100 - decreaser.cents;
            currentEuros = this.euros - 1;
        }
        if(currentEuros - decreaser.euros < 0){
            newEuro = 0;
            newCents = 0;
        }else{ 
            newEuro = currentEuros - decreaser.euros;
        }
        
            
        Money newMoney = new Money(newEuro, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared){ 
        if(this.euros < compared.euros){ 
            return true;
        }else if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            } 
            return false;
        }else{ 
            return false;
        }
        
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
