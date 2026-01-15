package classandobject.level2;

public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private int price;
    public MovieTicket(){}
    public void bookTicket(String movieName,int seatNumber,int price)
    {
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }
    public void ticketDetails()
    {
        System.out.println("Movie Name: "+movieName);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price: "+price);
    }
}
