package javamethods.level1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        checkNumber(number);
    }
    static void checkNumber(int number)
    {
        if(number<0) System.out.println(number+" is negative");
        else if(number==0) System.out.println(number+" is zero");
        else System.out.println(number+" is positive");
    }
}
