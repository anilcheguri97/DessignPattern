package model;

public class BankAccount {
    int accountNo;
    int balance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void updateBanlane(int amount){
        balance = balance-amount;
    }
}
