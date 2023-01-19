package exceptions.atm;

import lombok.Getter;

@Getter
public enum ExceptionMessages {
    NOT_ENOUGH_MONEY_IN_ATM("W bankomacie jest za mało pieniędy, maksymalnie moża wypłacić: %s"),
    TO_MUCH_MONEY_IN_ATM("Przekroczono maksymalną pojemnosć bankomatu, maksymalnie można wpłacić: %s");
    private final String message;
    ExceptionMessages(String message){
        this.message = message;
    }
}
