package javamethods.level1;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3= sc.nextInt();

        int smallest=findSmallest(number1,number2,number3);
        int largest=findLargest(number1,number2,number3);
        System.out.println("Smallest number is "+smallest+" and Largest number is "+largest);
    }
    static int findSmallest(int number1,int number2,int number3)
    {
        return Math.min(number1,Math.min(number2,number3));
    }
    static int findLargest(int number1,int number2,int number3)
    {
        return Math.max(number1,Math.max(number2,number3));
    }

}
