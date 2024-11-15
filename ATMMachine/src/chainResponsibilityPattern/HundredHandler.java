package chainResponsibilityPattern;

public class HundredHandler extends AmountHandler{
    AmountHandler amountHandler;
    HundredHandler(AmountHandler amountHandler){
super(amountHandler);
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
}
