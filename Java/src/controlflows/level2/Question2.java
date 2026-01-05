package controlflows.level2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yearsOfService=sc.nextInt();
        double salary= sc.nextDouble();
        if(yearsOfService>5)
        {
            double bonus=salary*0.05;
            salary=salary+bonus;
            System.out.println("Bonus amount is "+bonus+" and total salary is "+salary);
        }
    }
}
