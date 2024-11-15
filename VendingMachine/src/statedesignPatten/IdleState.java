package statedesignPatten;

import model.Coin;
import model.Item;
import model.VendingMachine;

import java.util.ArrayList;

public class IdleState implements StateVendingMachine{


    public IdleState() {
        System.out.println("vending machine is in idle state");
    }
    public  IdleState(VendingMachine machine){

        System.out.println("vending machine is in idle state");
        machine.setList(new ArrayList<>());
    }

    @Override
    public void insertCoinButton(VendingMachine machine) throws Exception {
        machine.setStateVendingMachine(new HasCoinState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {

    }

    @Override
    public void selectItemButton(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public Item selectItem(VendingMachine machine, int code) throws Exception {
       throw new Exception("pls select after inserting coins");
    }

    @Override
    public void cancelButton(VendingMachine machine) throws Exception {
        throw  new Exception("item is not selected to cancel");
    }

    @Override
    public void returnChange(VendingMachine machine) throws Exception {
      throw new Exception("coins not inserted to return change");
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
