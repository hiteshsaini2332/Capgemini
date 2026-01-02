package programmingpractice.lab1;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=input.nextInt();
        int number2=input.nextInt();
        int sumOfNumbers=number1+number2;
        int differenceOfNumbers=Math.abs(number1-number2);
        int productOfNumbers=number1*number2;
        int divisionOfNumbers=number1/number2;
        System.out.println("The addition, difference, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+sumOfNumbers+", "+differenceOfNumbers+", "+productOfNumbers+" and "+divisionOfNumbers);
    }
}
