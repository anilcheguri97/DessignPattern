package statedesignPatten;

import model.Coin;
import model.Item;
import model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class SelectionState implements StateVendingMachine{
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
    public Item selectItem(VendingMachine machine,int code) throws Exception {
        int sum = machine.getList().stream().mapToInt(Coin::getValue).sum();


    }

    @Override
    public void cancelButton(VendingMachine machine) throws Exception {
            machine.setStateVendingMachine(new IdleState());
    }

    @Override
    public void returnChange(VendingMachine machine) throws Exception {
    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {
      machine.setStateVendingMachine(new DispenceState());
    }

    @Override
    public void refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println(machine.getList());
        machine.setList(new ArrayList<>());
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) {

    }
}
