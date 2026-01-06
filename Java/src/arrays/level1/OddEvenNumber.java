package arrays.level1;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int size=number/2;
        int[]odd=new int[number%2!=0?size+1:size];
        int[]even=new int[size];
        int oddIndex=0;
        int evenIndex=0;
        for(int i=1;i<=number;i++)
        {

            if(i%2!=0)odd[oddIndex++]=i;
            else even[evenIndex++]=i;
        }
        System.out.println("Even Numbers are: ");
        for (int n:even) System.out.print(n+" ");
        System.out.println();
        System.out.println("Odd Numbers are: ");
        for(int n:odd) System.out.print(n+" ");


    }
}
