package exceptions.atm;

public class AtmApp {

    private static final Atm ATM = new Atm(1000d);

    public static void main(String[] args) {
        handelWithdraw(2000d);
//
//        System.out.println(atm.getBallance());
//        atm.withdraw(100d);
//        System.out.println(atm.getBallance());
//        atm.makeDeposit(200d);
//        System.out.println(atm.getBallance());
//
//        System.out.println("Próba wypłaty 20 000 : ");
//        atm.withdraw(20000d);


    }

    public static void handelWithdraw(Double amount){
        try {
            ATM.withdraw(amount);
        }
        catch (OutOfMoneyException e){
            System.out.println(e.getMessage());
        }

    }
}
