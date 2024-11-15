package chainResponsibilityPattern;

import model.Atm;
import model.BankAccount;

public class FiveHundredHandler extends AmountHandler {
    AmountHandler amountHandler;
    BankAccount bankAccount;
    FiveHundredHandler(AmountHandler amountHandler){
        super(amountHandler);
       // this.amountHandler =amountHandler;
    }

    int amount;
    int count;

    public AmountHandler getAmountHandler() {
        return amountHandler;
    }

    public void setAmountHandler(AmountHandler amountHandler) {
        this.amountHandler = amountHandler;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void withDraw(Atm atm, int amount) {

        int noOfFiveHundredNotes = atm.getNoOfFiveHundredNotes();

        int rem=amount/500;
        int balance = amount%500;
        if(rem<noOfFiveHundredNotes) {
            withDrawMoney(rem,atm);
        }
        else if(rem>noOfFiveHundredNotes) {
            withDrawMoney(noOfFiveHundredNotes,atm);
            balance = balance +(rem-noOfFiveHundredNotes)*500;
        }

      if(balance!=0) {
          super.withDraw(atm,balance);
      }

    }

    public void withDrawMoney(int notesCount,Atm atm) {
        atm.setNoOfFiveHundredNotes(atm.getNoOfFiveHundredNotes()-notesCount);
        atm.setAtmBalance(atm.getAtmBalance()-notesCount*500);
    }
}
