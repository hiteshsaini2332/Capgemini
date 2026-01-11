package CapgeminiQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AreStringsAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(areAnagram(str1,str2)) System.out.println(str1+" and "+str2+" are anagram");
        else System.out.println(str1+" and "+str2+" are not anagram");
    }
    static boolean areAnagram(String str1,String str2)
    {
        int []freq1=new int[26];
        int []freq2=new int[26];
        for(char ch:str1.toCharArray())
        {
            freq1[ch-'a']++;
        }
        for(char ch:str2.toCharArray())
        {
            freq2[ch-'a']++;
        }
        return Arrays.equals(freq1,freq2);
    }
}
