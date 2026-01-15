package classandobject.level1;

public class Item {
    private int itemCode;
    private String itemName;
    private  int price;

    Item(int itemCode,String itemName,int price)
    {
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    public void displayItemDetails()
    {
        System.out.println("Item's code: "+itemCode);
        System.out.println("Item's name: "+itemName);
        System.out.println("Item's price: "+price);
    }
    private int calculateCost(int quantity)
    {
        return price*quantity;
    }

}
