package linkedlist.inventorymanagement;

public class Item {
    private String itemName;
    private int itemID;
    private int quantity;
    private int price;
    Item next;

    public Item(String itemName,int itemID,int quantity,int price)
    {
        this.itemName=itemName;
        this.itemID=itemID;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }

    public int getPrice() {
        return price;
    }

    public int getItemID() {
        return itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
