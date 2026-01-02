package programmingpractice.lab1;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input= new  Scanner(System.in);
        double distanceInFeet= input.nextDouble();
        double distanceInMiles=distanceInFeet/5280;
        double distanceInYards=distanceInFeet/3;
        System.out.println("Given Distance in miles is "+String.format("%.2f",distanceInMiles)+ " and in yards is "+String.format("%.2f",distanceInYards));

    }
}
