package statedesignPatten;

import model.Coin;
import model.Item;
import model.VendingMachine;

public interface StateVendingMachine {
    public void insertCoinButton(VendingMachine machine) throws Exception;
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    public void selectItemButton(VendingMachine machine, Coin coin) throws Exception;

    public Item selectItem(VendingMachine machine,int code) throws Exception;
    public void cancelButton(VendingMachine machine) throws Exception;
    public void returnChange(VendingMachine machine) throws Exception;
    public void dispenseProduct(VendingMachine machine) throws  Exception;
    public void refundFullMoney(VendingMachine machine) throws Exception;
    public  void updateInventory(VendingMachine  machine, Item item,int codeNumber);

}
