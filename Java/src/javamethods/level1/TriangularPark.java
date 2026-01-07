package javamethods.level1;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int side1= sc.nextInt();
        System.out.println("Enter side 2 ");
        int side2= sc.nextInt();
        System.out.println("Enter side 3");
        int side3= sc.nextInt();
        int rounds=calculateNumberOfRounds(side1,side2,side3);
        System.out.println("Athlete need to complete "+rounds+" round of triangular park to complete 5km run ");
    }
    static int calculateNumberOfRounds(int side1,int side2,int side3)
    {
        int perimeterOfPark=side1+side2+side3;
        return perimeterOfPark/5;
    }
}
