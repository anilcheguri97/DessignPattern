package statedesignPatten;

import model.Coin;
import model.Item;
import model.VendingMachine;

import java.util.ArrayList;

public class HasCoinState implements StateVendingMachine{
    @Override
    public void insertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accept coin");
        machine.getList().add(coin);
    }

    @Override
    public void selectItemButton(VendingMachine machine, Coin coin) throws Exception {
        machine.setStateVendingMachine(new SelectionState());

    }

    @Override
    public Item selectItem(VendingMachine machine, int code) throws Exception {
        return  null;
    }

    @Override
    public void cancelButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void returnChange(VendingMachine machine) throws Exception {

    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {

    }

    @Override
    public void refundFullMoney(VendingMachine machine) throws Exception {

    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) {

    }
}
