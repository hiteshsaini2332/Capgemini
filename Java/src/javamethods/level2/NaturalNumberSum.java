package javamethods.level2;

import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number.");
            return;
        }

        int sumRecursive = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal!");
        }
    }


    static int sumUsingRecursion(int n) {
        if (n == 1)
            return 1;
        return n + sumUsingRecursion(n - 1);
    }


    static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
