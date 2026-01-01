package programmingpractice.lab1;

public class Question3 {
    public static void main(String[] args) {
        double conversionRate=1.6;
        double distanceInKm=10.8;
        double distanceInMiles=distanceInKm*conversionRate;
        System.out.println("The distance "+distanceInKm+" km in miles is :"+distanceInMiles+" miles");
    }
}
