package linkedlist.librarymanagement;

public class Library {
    private Book head;
    private Book tail;

    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        Book newNode = new Book(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        Book newNode = new Book(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
   public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos <= 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        Book temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp == tail) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        Book newNode = new Book(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    void removeById(int id) {
        if (head == null) return;

        Book temp = head;

        while (temp != null && temp.getBookId() != id)
            temp = temp.next;

        if (temp == null) return;

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        }
        else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
    Book searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.getTitle().equalsIgnoreCase(title))
                return temp;
            temp = temp.next;
        }
        return null;
    }
    Book searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.getAuthor().equalsIgnoreCase(author))
                return temp;
            temp = temp.next;
        }
        return null;
    }
    void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.getBookId() == id) {
                temp.setAvailable(status);
                return;
            }
            temp = temp.next;
        }
    }
    void displayForward() {
        Book temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }
    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }
    private void printBook(Book b) {
        System.out.println(
                b.getBookId() + " | " +
                        b.getTitle() + " | " +
                        b.getAuthor() + " | " +
                        b.getGenre() + " | " +
                        (b.isAvailable() ? "Available" : "Not Available")
        );
    }
    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}