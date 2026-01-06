package arrays.level1;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []numbers=new int[5];
        for(int i=0;i<5;i++)
        {
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(numbers[i]<0) System.out.println(numbers[i]+" is negative");
            else if(numbers[i]==0) System.out.println(numbers[i]+" is zero");
            else{
                if(numbers[i]%2==0) System.out.println(numbers[i]+" is even number ");
                else System.out.println(numbers[i]+" is odd number");
            }
        }
        if(numbers[0]==numbers[4])
        {
            System.out.println("First and Last numbers are equal");
        }
        else System.out.println("First and Last numbers are not equal");
    }
}
