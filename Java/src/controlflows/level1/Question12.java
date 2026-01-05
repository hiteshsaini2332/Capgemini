package controlflows.level1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int sumFromLoop=0;
        int sumFromFormula=number*(number-1)/2;

        while(number>0)
        {
            sumFromLoop+=number;
            number--;
        }
        if(sumFromLoop==sumFromFormula)
        {
            System.out.println("Sum is equal from both methods and sum is "+sumFromFormula);
        }
        else{
            System.out.println("Sum is not equal from both methods");
        }
    }
}
