package controlflows.level1;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int fact=1;
        while(number>0)
        {
            fact*=number;
            number--;
        }
        System.out.println("The factorial of "+number+" is "+fact);
    }
}
