package CapgeminiQuestions;

import java.util.Scanner;

public class IsNumberPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if(checkPalindrome(number))
        {
            System.out.println(number+" is palindrome");
        }
        else System.out.println(number+" is not palindrome");
    }
    static boolean checkPalindrome(int number)
    {
        int orig=number;
        int temp=0;
        while(orig>0)
        {
            temp=temp*10+orig%10;
            orig/=10;
        }
        return number==temp;
    }
}
