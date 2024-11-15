package model;

import statedesignPatten.IdleState;
import statedesignPatten.StateVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    StateVendingMachine stateVendingMachine;
    List<Coin> list ;
    ItemInventory itemInventory;
    public VendingMachine() {
        stateVendingMachine = new IdleState();
        itemInventory = new ItemInventory();
        list = new ArrayList<>();


    }

    public List<Coin> getList() {
        return list;
    }

    public void setList(List<Coin> list) {
        this.list = list;
    }

    public ItemInventory getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(ItemInventory itemInventory) {
        this.itemInventory = itemInventory;
    }


    public VendingMachine(StateVendingMachine stateVendingMachine) {
        this.stateVendingMachine = stateVendingMachine;
    }


    public StateVendingMachine getStateVendingMachine() {
        return stateVendingMachine;
    }

    public void setStateVendingMachine(StateVendingMachine stateVendingMachine) {
        this.stateVendingMachine = stateVendingMachine;
    }


}
