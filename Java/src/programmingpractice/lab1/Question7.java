package programmingpractice.lab1;

public class Question7 {
    public static void main(String[] args) {
        int radiusOfEarthInKm=6378;
        double radiusOfEarthInMiles=10204.8;
        double PI=3.14;
        double volumeOfEarthInKm3=(4/3)*PI*radiusOfEarthInKm*radiusOfEarthInKm*radiusOfEarthInKm;
        double volumeOfEarthInMiles3=(4/3)*PI*radiusOfEarthInMiles*radiusOfEarthInMiles*radiusOfEarthInMiles;
        System.out.println("The Volume of Earth in cubic kilometers is "+ volumeOfEarthInKm3+ " and cubic miles is "+volumeOfEarthInMiles3);

    }
}
