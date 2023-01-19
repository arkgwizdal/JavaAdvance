package exceptions.atm;

import static exceptions.atm.ExceptionMessages.TO_MUCH_MONEY_IN_ATM;

public class ToMachMoneyException extends Throwable {

    public ToMachMoneyException(Double amount){
        super(String.format(TO_MUCH_MONEY_IN_ATM.getMessage()));
    }
}
