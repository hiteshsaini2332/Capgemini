package CapgeminiQuestions;

import java.util.Scanner;

public class SumEvenIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=evenSum(num);
        System.out.println("Sum of even positions(0-based Index) is "+sum);
    }
    static int evenSum(int num)
    {
        int sum=0;
        int length=getLength(num);
        int index=length-1;
        while(num>0)
        {
            int last=num%10;
            if(index%2==0)sum+=last;
            index--;
            num/=10;
        }
        return sum;
    }
    static int getLength(int num)
    {
        int len=0;
        while (num>0)
        {
            len++;
            num/=10;
        }
        return len;
    }
}
