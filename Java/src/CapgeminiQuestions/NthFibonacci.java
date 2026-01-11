package CapgeminiQuestions;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        findNthTerm(number);

    }
    static void findNthTerm(int number)
    {
        int first=0;
        int second=1;
        System.out.print(first+" ");
        if(number>=1) System.out.print(second+" ");

        for(int i=2;i<=number;i++)
        {

            int temp=first+second;
            System.out.print(temp+" ");
            first=second;
            second=temp;
        }
    }
}
