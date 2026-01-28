package linkedlist.moviemanagement;

public class Movie {
    private String title;
    private String director;
    private int yearOfRelease;
    private int rating;
    Movie next;
    Movie prev;

    public Movie(String title,String director,int yearOfRelease,int rating)
    {
        this.title=title;
        this.director=director;
        this.yearOfRelease=yearOfRelease;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
