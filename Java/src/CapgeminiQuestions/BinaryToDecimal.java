package CapgeminiQuestions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int numInDecimal=binaryToDecimal(number);
        System.out.println(number+" in decimal will be "+numInDecimal);
    }
    static int binaryToDecimal(int num)
    {
        int index=0;
        int ans=0;
        while(num>0)
        {
            int lastDigit=num%10;
            if(lastDigit==1)ans+=(int)Math.pow(2,index);
            index++;
            num/=10;
        }
        return ans;
    }
}
