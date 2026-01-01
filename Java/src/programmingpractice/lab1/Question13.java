package programmingpractice.lab1;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int perimeterOfSquare= input.nextInt();
        int sideOfSquare=perimeterOfSquare/4;
        System.out.println("The length of side is "+sideOfSquare+" whose perimeter is "+perimeterOfSquare);
    }
}
