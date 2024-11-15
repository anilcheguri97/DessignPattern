package model;

public enum Coin {
    TEN(10),
    FIVE(5),
    TWO(2);

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Coin(int value) {
        this.value = value;
    }
}
