package CapgeminiQuestions;

import java.util.Scanner;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String ans=removeSpecialChar(string);
        System.out.println("After Removing special characters from string ");
        System.out.println(ans);
    }
    static String removeSpecialChar(String string)
    {
        StringBuilder sb=new StringBuilder();
        for(char ch:string.toCharArray())
        {
            if(Character.isLetterOrDigit(ch)||ch==' ')
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
