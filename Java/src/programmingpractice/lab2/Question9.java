package programmingpractice.lab2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();
        int perimeterOfPark=side1+side2+side3;
        int distanceToCover=5;
        int numberOfRounds=perimeterOfPark/distanceToCover;
        System.out.println("The total number of rounds the athlete will run is "+ numberOfRounds+" to complete 5km");
    }
}
