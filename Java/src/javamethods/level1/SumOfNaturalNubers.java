package javamethods.level1;

import java.util.Scanner;

public class SumOfNaturalNubers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int ans=calculateSum(number);
        System.out.println("The sum of "+number+" natural numbers is "+ ans);
    }
    static int calculateSum(int number)
    {
        int sum=0;
        for (int i =1; i <= number; i++) {
            sum+=i;
        }
        return  sum;
    }
}
