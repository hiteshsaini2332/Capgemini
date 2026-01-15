package classandobject.level2;

import java.util.HashMap;
import java.util.List;

public class CartItem {
    private String itemName;
    private int price;
    private int quantity;
    HashMap<String, CartItem>cart=new HashMap<>();

    public CartItem(){}
    public CartItem(String itemName,int price,int quantity)
    {
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public void addToCart(String itemName,int price,int quantity)
    {
        if(cart.containsKey(itemName))
        {
            CartItem item=cart.get(itemName);
            item.quantity+=quantity;
        }
        else{
            cart.put(itemName,new CartItem(itemName,price,quantity));
        }
    }
    public void removeItem(String name)
    {
        cart.remove(name);
    }
    public void displayCost()
    {
        int cost=0;
        for(CartItem values:cart.values())
        {
            cost+=values.price*values.quantity;
        }
        System.out.println("Total cost of cart is "+cost);
    }
}
