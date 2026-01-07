package javamethods.level1;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
        System.out.println("Enter divisor");
        int divisor= sc.nextInt();
        int remainder=findRemainder(number,divisor);
        int quotient=findQuotient(number,divisor);
        System.out.println("Remainder is "+remainder+" and Quotient is "+quotient);
    }
    static int findRemainder(int number,int divisor)
    {
        return number%divisor;
    }
    static int findQuotient(int number,int divisor)
    {
        return number/divisor;
    }
}
