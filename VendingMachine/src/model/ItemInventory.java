package model;

import java.util.List;

public class ItemInventory {
    List<ItemSelf> itemSelfList;

    public List<ItemSelf> getItemSelfList() {
        return itemSelfList;
    }

    public void setItemSelfList(List<ItemSelf> itemSelfList) {
        this.itemSelfList = itemSelfList;
    }

    public Item getById(int code) {

        for(ItemSelf itemSelf : itemSelfList) {
            for(Item item : itemSelf.getItemList()) {
                if(item.getItemId() == code) {
                    return item;

                }
            }
        }
        return null;
    }
}
