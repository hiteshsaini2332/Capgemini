package CapgeminiQuestions;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String ans=capitalize(string);
        System.out.println("Afte capitalizing first letter of each word ");
        System.out.println(ans);
    }
    static String capitalize(String string)
    {
        StringBuilder sb=new StringBuilder();
        char c=string.charAt(0);
        sb.append(Character.toUpperCase(c));
        for (int i = 1; i < string.length(); i++) {
            char ch=string.charAt(i);
            if(i>0&&string.charAt(i-1)==' '&& ch!=' ')
            {
                ch=Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
