package CapgeminiQuestions;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int starting=sc.nextInt();
        int ending= sc.nextInt();
        findPrimeNumbers(starting,ending);
    }
    static void findPrimeNumbers(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+"is a Prime Number");
            }
        }
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
