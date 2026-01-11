package CapgeminiQuestions;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string= sc.next();
        int vowels=countVowels(string);
        System.out.println("Vowels is string is "+vowels);
    }
    static int countVowels(String string)
    {
        int count=0;
        String vowel="aeiouAEIOU";
        for(char ch:string.toCharArray())
        {
            if(vowel.indexOf(ch)!=-1)
            {
                count++;
            }
        }
        return count;
    }
}
