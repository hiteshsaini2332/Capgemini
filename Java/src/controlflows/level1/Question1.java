package controlflows.level1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        if(number%5==0)
        {
            System.out.print(" Is the number "+number+" divisible by 5 ?  Yes");
        }
        else{
            System.out.print(" Is the number "+number+" divisible by 5 ?  No");
        }
    }
}
