package CapgeminiQuestions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        String numInBinary=decimalToBinary(number);
        System.out.println(number+" in binary will be "+numInBinary);
    }
    static String decimalToBinary(int num)
    {
        StringBuilder sb=new StringBuilder();
        if (num==0)return "0";
        while(num>0)
        {
            int temp=num&1;
            sb.append(temp);
            num=num>>1;
        }
        return sb.reverse().toString();
    }
}
