package programmingpractice.Lab_2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int weightInPounds= input.nextInt();
        double weightInKg=weightInPounds*2.2;
        System.out.println("The weight of the person in pounds is "+ weightInPounds+" and in Kg is "+weightInKg);
    }
}
