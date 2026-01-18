package keywords;

public class Product {
    static int discount=20;
    private String productName;
    private int price;
    private int quantity;
    private final int productID;

    Product(String productName,int productID,int price,int quantity)
    {
        this.productName=productName;
        this.productID=productID;
        this.price=price;
        this.quantity=quantity;
    }

    static void updateDiscount(int d)
    {
        discount=d;
    }

    public void displayProductDetails(Object obj)
    {
        if(obj instanceof  Product)
        {
            System.out.println("Product Name: "+productName);
            System.out.println("Product Id: "+productID);
            System.out.println("Product Price: "+price);
            System.out.println("Product Quantity: "+quantity);
        }
    }

}
