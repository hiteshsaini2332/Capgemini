package CapgeminiQuestions;

import java.util.Scanner;

public class GcdAndLcm {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd=findGCD(a,b);
        int lcm=a*b/gcd;
        System.out.println("GCD (HCF) = " + gcd);
        System.out.println("LCM = " + lcm);
    }
    static  int findGCD(int a,int b)
    {
        int gcd = 1;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
