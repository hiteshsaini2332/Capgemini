package CapgeminiQuestions;

import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String ans=replaceSpaces(string);
        System.out.println("After replacing spaces with hyphen new string will be "+ans);
    }
    static String replaceSpaces(String string)
    {
        StringBuilder sb=new StringBuilder();
        for(char ch:string.toCharArray())
        {
            if(ch==' ')
            {
                sb.append('-');
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
