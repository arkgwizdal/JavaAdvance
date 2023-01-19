package exceptions.atm;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import static exceptions.atm.ExceptionMessages.NOT_ENOUGH_MONEY_IN_ATM;
import static java.lang.String.format;

/**
 * Klasa reprezentująca bankomat
 */
@Setter
public class Atm {
    private  Double cash;
    private Double capascity = 10000d;

    public Atm(Double cash) {
        this.cash = cash;
    }

    /**
     * Metoda odpowiedzialana za wpłate pieniędzy
     * @param ammount
     * @throws ToMachMoneyException
     */
    public void makeDeposit(Double ammount) throws ToMachMoneyException {
        if(this.capascity < (this.cash + ammount)){
            var maxDeposit = capascity-cash;
            throw new ToMachMoneyException(maxDeposit);
        }
        this.cash = this.cash + ammount;
    }

    public void withdraw(Double amount){
        Double cash = this.cash;
        if(cash - amount <=0 ){
            throw new OutOfMoneyException(format(NOT_ENOUGH_MONEY_IN_ATM.getMessage(),cash));
        }
        this.cash -= amount;
    }

    public String getBallance() {
        return this.cash.toString();
    }
}
