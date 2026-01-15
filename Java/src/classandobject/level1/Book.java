package classandobject.level1;

public class Book {
    private String title;
    private String author;
    private int price;
    Book(String title,String author,int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void displayBookDetails()
    {
        System.out.println("Book's title: "+title);
        System.out.println("Book's author: "+author);
        System.out.println("Book's price: "+price);
    }

}
