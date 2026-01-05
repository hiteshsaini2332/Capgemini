package controlflows.level1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        while(number>0)
        {
            System.out.println(number);
            number--;
        }
    }
}
