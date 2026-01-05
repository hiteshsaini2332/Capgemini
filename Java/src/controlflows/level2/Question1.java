package controlflows.level2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                System.out.println(number+" is even number");
            }
            else{
                System.out.println(number+" is odd number");
            }
        }
    }
}
