package linkedlist.inventorymanagement;

public class ItemTest {
    static void main() {
        ItemList inv = new ItemList();

        inv.insertAtEnd( "Laptop", 101,5, 50000);
        inv.insertAtBeginning( "Mouse", 102,20, 500);
        inv.insertAtEnd( "Keyboard",103, 10, 1500);

        inv.display();

        inv.updateQuantity(101, 7);
        inv.removeItem(102);



        inv.sortByPrice(true);
        inv.display();
    }
}
