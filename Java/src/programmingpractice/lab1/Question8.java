package programmingpractice.lab1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double distanceInKm=input.nextDouble();
        double distanceInMiles=distanceInKm*1.6;
        System.out.println("The total miles is "+distanceInMiles+"mile for the given "+distanceInKm+" km");
    }
}
