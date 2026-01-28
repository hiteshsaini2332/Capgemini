package linkedlist.inventorymanagement;

public class ItemList {
    private Item head = null;
    private Item tail = null;

    public void insertAtBeginning(String itemName, int itemId, int quantity, int price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = tail = newItem;
        }
        newItem.next = head;
        head = newItem;
    }

    public void insertAtEnd(String itemName, int itemId, int quantity, int price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = tail = newItem;
        }
        tail.next = newItem;
        tail = newItem;
    }

    public void insertAtPosition(String itemName, int itemId, int quantity, int price, int pos) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (pos == 1) {
            insertAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            newItem.next = temp.next.next;
            temp.next = newItem;
        }
    }

    public void removeItem(int itemId) {
        if (head.getItemID() == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next.getItemID() != itemId) {
            if (temp == null) {
                System.out.println("Invalid Item Id");
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next = null;
    }

    public void searchByName(String itemName) {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Item temp = head;
        while (temp.getItemName().equalsIgnoreCase(itemName)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Wrong Item Name");
            return;
        }
        System.out.println("Item Name: " + temp.getItemName() + " ,Item ID: " + temp.getItemID() + ", Item Quantity: " + temp.getQuantity() + " ,Item Price: " + temp.getPrice());
    }

    public void searchById(int itemId) {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Item temp = head;
        while (temp.getItemID() != itemId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Wrong Item Id");
            return;
        }
        System.out.println("Item Name: " + temp.getItemName() + "\nItem ID: " + temp.getItemID() + "\nItem Quantity: " + temp.getQuantity() + "\nItem Price: " + temp.getPrice());
    }

    public void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.getItemID() == id) {
                temp.setQuantity(newQty);
                return;
            }
            temp = temp.next;
        }
    }

    public void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println(
                    temp.getItemID() + " | " +
                            temp.getItemName() + " | Qty: " +
                            temp.getQuantity() + " | Price: " +
                            temp.getPrice()
            );
            temp = temp.next;
        }
    }


    public void displayCost() {
        Item temp = head;
        while (temp != null) {
            int quantity = temp.getQuantity();
            int price = temp.getPrice();
            int cost = quantity * price;
            System.out.println("Item Name: " + temp.getItemName() + "\nItem ID: " + temp.getItemID() + "\nItem Quantity: " + temp.getQuantity() + "\nItem Price: " + temp.getPrice() + "\nTotal Cost: " + cost);

        }
    }

    public void sortByName(boolean ascending) {
        head = mergeSortByName(head, ascending);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSortByPrice(head, ascending);
    }

    private Item mergeSortByName(Item node, boolean asc) {
        if (node == null || node.next == null)
            return node;

        Item mid = getMiddle(node);
        Item nextToMid = mid.next;
        mid.next = null;

        Item left = mergeSortByName(node, asc);
        Item right = mergeSortByName(nextToMid, asc);

        return mergeByName(left, right, asc);
    }

    private Item mergeByName(Item a, Item b, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        if ((asc && a.getItemName().compareToIgnoreCase(b.getItemName()) <= 0) ||
                (!asc && a.getItemName().compareToIgnoreCase(b.getItemName()) > 0)) {
            a.next = mergeByName(a.next, b, asc);
            return a;
        } else {
            b.next = mergeByName(a, b.next, asc);
            return b;
        }
    }

    private Item mergeSortByPrice(Item node, boolean asc) {
        if (node == null || node.next == null)
            return node;

        Item mid = getMiddle(node);
        Item nextToMid = mid.next;
        mid.next = null;

        Item left = mergeSortByPrice(node, asc);
        Item right = mergeSortByPrice(nextToMid, asc);

        return mergeByPrice(left, right, asc);
    }

    private Item mergeByPrice(Item a, Item b, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        if ((asc && a.getPrice() <= b.getPrice()) ||
                (!asc && a.getPrice() > b.getPrice())) {
            a.next = mergeByPrice(a.next, b, asc);
            return a;
        } else {
            b.next = mergeByPrice(a, b.next, asc);
            return b;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head;
        Item fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}


