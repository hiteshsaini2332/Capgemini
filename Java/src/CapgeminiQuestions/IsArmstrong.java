package CapgeminiQuestions;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(checkArmstrong(number)) System.out.println(number+" is Armstrong");
        else System.out.println(number+" is not Armstrong");
    }
    static boolean checkArmstrong(int number )
    {
        String temp=String.valueOf(number);
        int length=temp.length();
        int orig=number;
        int ans=0;
        while(orig>0)
        {
            int lastDigit=orig%10;
            ans+=(int)Math.pow(lastDigit,length);
            orig/=10;
        }
        return number==ans;
    }
}
