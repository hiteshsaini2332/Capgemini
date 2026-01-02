package programmingpractice.Lab_2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numberOfStudents= input.nextInt();
        int numberOfChocolates= input.nextInt();

        int chocolatePerStudent=numberOfChocolates/numberOfStudents;
        int remainingChocolates=numberOfChocolates%numberOfStudents;

        System.out.println("The number of chocolates each child gets is "+chocolatePerStudent+" and the number of remaining chocolates are "+ remainingChocolates);

    }
}
