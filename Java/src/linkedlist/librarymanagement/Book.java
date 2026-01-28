package linkedlist.librarymanagement;

public class Book {
    private int bookId;
    private String title;
   private String author;
    private String genre;
    private boolean available;

    Book next;
    Book prev;

    Book(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = null;
        this.prev = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getBookId() {
        return bookId;
    }

    public String getGenre() {
        return genre;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
