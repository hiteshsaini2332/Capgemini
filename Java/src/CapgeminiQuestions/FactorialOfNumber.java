package CapgeminiQuestions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int fact=factOfNumber(number);
        System.out.println("Factorial of "+number+" is "+fact);
    }
    static int factOfNumber(int num)
    {
        int ans=1;
        if(num==0||num==1)return 1;
        for(int i=2;i<=num;i++)
        {
            ans*=i;
        }
        return ans;
    }
}
