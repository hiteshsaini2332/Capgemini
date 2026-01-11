package CapgeminiQuestions;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String ans=removeVowels(string);
        System.out.println("After removing vowels string will be "+ans);
    }
    static String removeVowels(String string)
    {
        StringBuilder sb=new StringBuilder();
        String vowels="aeiouAEIOU";
        for(char ch:string.toCharArray())
        {
            if(vowels.indexOf(ch)!=-1)
            {
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
