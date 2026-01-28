package linkedlist.moviemanagement;

public class MovieList{
    private Movie head;
    private Movie tail;

    public void insertAtBeginning(String title,String director,int yearOfRelease,int rating)
    {
        Movie newMovie=new Movie(title,director,yearOfRelease,rating);
        if(head==null)
        {
            head=tail=newMovie;
        }
        newMovie.next=head;
        head.prev=newMovie;
        head=newMovie;
    }
    public void insertAtEnd(String title,String director,int yearOfRelease,int rating)
    {
        Movie newMovie=new Movie(title,director,yearOfRelease,rating);
        if(tail==null)
        {
            head=tail=newMovie;
            return;
        }
        tail.next=newMovie;
        newMovie.prev=tail;
        tail=newMovie;
    }

    public void insertAtPosition(String title,String director,int yearOfRelease,int rating,int pos)
    {
        if(pos==1){
            insertAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        Movie newMovie=new Movie(title,director,yearOfRelease,rating);
        Movie temp=head;
        for(int i=1;i<pos-1&&temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }
        newMovie.next=temp.next;
        newMovie.prev=temp;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        }
        temp.next=newMovie;
    }

    public void removeMovie(String title)
    {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.getTitle().equals(title)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Movie temp=head;
        while(temp.next!=null && !temp.next.getTitle().equals(title))
        {
            temp=temp.next;
        }
        if (temp.next == null) {
            System.out.println("Movie not found");
            return;
        }

        if(temp.next.next!=null)
        {
            temp.next.next.prev=temp;
        }
        else{
            tail=temp;
        }
        temp.next=temp.next.next;
    }

    public void searchByDirector(String director)
    {
        Movie temp=head;
        while(temp!=null)
        {
            if(temp.getDirector().equals(director))
            {
                System.out.println("Movie Title "+temp.getTitle()+" ,Movie Director "+temp.getDirector()+" ,Movie Release Year "+temp.getYearOfRelease()+" ,Movie Rating "+temp.getRating());
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie Not Found");
    }
    public void searchByRating(int rating)
    {
        Movie temp=head;
        while(temp!=null)
        {
            if(temp.getRating()==(rating))
            {
                System.out.println("Movie Title "+temp.getTitle()+" ,Movie Director "+temp.getDirector()+" ,Movie Release Year "+temp.getYearOfRelease()+" ,Movie Rating "+temp.getRating());
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie Not Found");
    }
    public void displayMovies()
    {
        Movie temp1=head;
        Movie temp2=tail;
        System.out.println("Movies in forward order :-");
        while(temp1!=null)
        {
            System.out.println("Movie Title "+temp1.getTitle()+" ,Movie Director "+temp1.getDirector()+" ,Movie Release Year "+temp1.getYearOfRelease()+" ,Movie Rating "+temp1.getRating());
            temp1=temp1.next;
        }
        System.out.println("Movies in backward order :-");
        while(temp2!=null)
        {
            System.out.println("Movie Title "+temp2.getTitle()+" ,Movie Director "+temp2.getDirector()+" ,Movie Release Year "+temp2.getYearOfRelease()+" ,Movie Rating "+temp2.getRating());
            temp2=temp2.prev;
        }
    }
    public void updateRating(String title,int rating)
    {
        Movie temp=head;
        while (temp!=null)
        {
            if(temp.getTitle().equals(title))
            {
                temp.setRating(rating);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie Not Found");
    }
}
