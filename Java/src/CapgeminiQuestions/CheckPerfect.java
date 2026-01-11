package CapgeminiQuestions;

import java.util.Scanner;

public class CheckPerfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isPerfect(number)) System.out.println(number+" is perfect number");
        else System.out.println(number+" is not a perfect number");
    }
    static boolean isPerfect(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)sum+=i;
        }
        return num==sum;
    }
}
