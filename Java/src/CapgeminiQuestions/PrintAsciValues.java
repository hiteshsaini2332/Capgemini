package CapgeminiQuestions;

import java.util.Scanner;

public class PrintAsciValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        for(char ch:string.toCharArray())
        {
            int value=ch;
            System.out.println(ch+"'s ascii value is "+value);
        }
    }
}
