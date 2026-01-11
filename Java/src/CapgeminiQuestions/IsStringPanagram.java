package CapgeminiQuestions;

import java.util.Scanner;

public class IsStringPanagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        if(isPanagram(string)) System.out.println(string+" is panagram");
        else System.out.println(string+" is not panagram");
    }
    static boolean isPanagram(String string)
    {
        int []freq=new int[26];
        for(char ch:string.toCharArray())
        {
            if(ch>='A'&& ch<='Z')ch=(char)(ch+32);
            freq[ch-'a']++;
        }
        for(int i:freq){
            if(i==0)return false;
        }
        return true;
    }
}
