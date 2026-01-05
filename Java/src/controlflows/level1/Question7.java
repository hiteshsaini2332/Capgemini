package controlflows.level1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int day= sc.nextInt();
        if((month>=3 && day>=20)&& (month<=6 && day<=20))
        {
            System.out.println("Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
    }
}
