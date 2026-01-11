package CapgeminiQuestions;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String ans=reverseWords(string);
        System.out.println("After Reversing Words "+ans);
    }
    static String reverseWords(String string)
    {
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(i+1<string.length()&& string.charAt(i+1)==' '&&ch!=' ')
            {
                sb.append(ch);
                ans.append(sb.reverse()).append(" ");
                sb.setLength(0);
            }
            else{
                sb.append(ch);
            }
        }
        return ans.toString();
    }
}
