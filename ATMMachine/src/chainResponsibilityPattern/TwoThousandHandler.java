package chainResponsibilityPattern;

public class TwoThousandHandler extends AmountHandler {
    AmountHandler amountHandler;

    TwoThousandHandler(AmountHandler amountHandler) {
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
