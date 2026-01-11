package CapgeminiQuestions;

import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] count=countEvenOdd(num);
        System.out.println(count[0]+" are even digits and "+count[1]+" are odd digits");
    }
    static int[]countEvenOdd(int num)
    {
        int evenCount=0;
        int oddCount=0;
        while(num>0)
        {
            int last=num%10;
            if(last%2==0)evenCount++;
            else oddCount++;
            num/=10;
        }
        return new int[]{evenCount,oddCount};
    }
}
