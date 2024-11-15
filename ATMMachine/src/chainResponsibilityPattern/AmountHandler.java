package chainResponsibilityPattern;

import model.Atm;

public abstract class AmountHandler {

    AmountHandler amountHandler;

    public AmountHandler(AmountHandler amountHandler) {
        this.amountHandler = amountHandler;
    }

    public   void withDraw(Atm atm, int amount) {
        if(amountHandler!=null){
            amountHandler.withDraw(atm,amount);
        }
    }



    int amount;
    int count;
}
