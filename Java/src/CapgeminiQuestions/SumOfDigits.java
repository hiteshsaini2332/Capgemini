package CapgeminiQuestions;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        int sum=findDigitsSum(number);
        System.out.println(sum+" is the sum of the digit of the number "+number);
    }
    static int findDigitsSum(int number)
    {
        int sum=0;
        while(number>0)
        {
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
