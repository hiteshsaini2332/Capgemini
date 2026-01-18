package keywords;

public class Book {

    static String libraryName="ABC";
    private String title;
    private String author;
    private final int isbn;

   Book(String title,String author,int isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    static void displayLibraryName(){
        System.out.println("Library Name: "+libraryName);
    }

    public void displayBookDetails(Object obj)
    {
       if(obj instanceof Book)
       {
           System.out.println("Book's Title: "+title);
           System.out.println("Book's Author: "+author);
           System.out.println("Book's ISBN: "+isbn);
       }
    }
}
