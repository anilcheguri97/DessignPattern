import model.*;
import statedesignPatten.StateVendingMachine;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Item choclate = new Item();
        choclate.setCount(3);
        choclate.setItem(ItemType.CHOCOLATE);
        choclate.setPrice(10);
        choclate.setItemId(100);
        Item biscuit = new Item();
        biscuit.setCount(3);
        biscuit.setItem(ItemType.BISCIUT);
        biscuit.setPrice(20);
        biscuit.setItemId(101);

        ItemSelf itemSelf = new ItemSelf();
        itemSelf.setItemList(List.of(choclate,biscuit));
        ItemInventory itemInventory = new ItemInventory();
        itemInventory.setItemSelfList(List.of(itemSelf));

        VendingMachine machine = new VendingMachine();

        StateVendingMachine state = machine.getStateVendingMachine();
        System.out.println(state);
        state.insertCoin(machine,null);

        state = machine.getStateVendingMachine();
        System.out.println(state);
        state.insertCoin(machine,Coin.FIVE);
        state.insertCoin(machine,Coin.FIVE);

        state.


    }
}