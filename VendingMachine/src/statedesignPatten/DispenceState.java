package statedesignPatten;

import model.Coin;
import model.Item;
import model.VendingMachine;

public class DispenceState implements StateVendingMachine{
    @Override
    public void insertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void selectItemButton(VendingMachine machine, Coin coin) throws Exception {

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
