package model;

public class Room {
    Atm atm;
    User user;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNo(125365);
        bankAccount.setBalance(10000);
        Card card = new Card();
        card.setBankAccount(bankAccount);
        card.setCvv(123);
        card.setExpirydate("12-28");
        card.setPin(1234);
        User user = new User();
        user.setCard(card);
        user.setName("Anil");

        Atm atmObject =   Atm.getAtmObject();
        atmObject.setAmountBalance(10000,3,4,20);

        System.out.println( atmObject.getStateInteface() + " "+ atmObject.getAtmBalance());
        atmObject.getStateInteface().insertCard(atmObject);
        atmObject.getStateInteface().readCard(atmObject);

        atmObject.getStateInteface().options(atmObject);

    }
}
