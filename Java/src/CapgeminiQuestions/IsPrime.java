package CapgeminiQuestions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isPrime(number)) System.out.println(number+" is Prime Number");
        else System.out.println(number+" is not a Prime number");
    }
    static boolean isPrime(int number)
    {
        int count=1;
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)count++;
        }
        return count==2;
    }
}
