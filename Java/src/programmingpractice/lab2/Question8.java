package programmingpractice.lab2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name =input.next();
        String fromCity=input.next();
        String toCity=input.next();
        String viaCity=input.next();

        double distanceFromToVia= input.nextDouble();
        double distanceViaToFinal= input.nextDouble();

        double timeFromToVia=input.nextDouble();
        double timeViaToFinal=input.nextDouble();

        double totalDistance=distanceFromToVia+distanceViaToFinal;
        double totalTime=timeFromToVia+timeViaToFinal;
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + String.format("%.2f",totalTime) + " hours");
    }
}
