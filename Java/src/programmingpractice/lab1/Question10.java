package programmingpractice.lab1;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double heightInCm=input.nextDouble();
        double totalInches=heightInCm/2.54;

        int  heightInFoot=(int) (totalInches/12);
        double remainingInches=totalInches%12;
        System.out.println("Your height in cm is "+heightInCm+" while in feet is "+heightInFoot+" and inches is "+ String.format("%.2f",remainingInches));
        input.close();



    }
}
