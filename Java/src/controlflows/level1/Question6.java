package controlflows.level1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<0)
        {
            System.out.println("Number is negative");
        }
        else if(number==0)
        {
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is positive");
        }
    }
}
