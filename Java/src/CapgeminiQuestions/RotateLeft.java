package CapgeminiQuestions;

import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        int k=sc.nextInt();


        rotate(arr,size,k);
        System.out.println("After rotating array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate(int[]arr,int size,int k)
    {
        k=k%size;
        int []temp=new int[size];
        int index=0;
        for(int i=k;i<size;i++)
        {
            temp[index++]=arr[i];
        }
        for(int i=0;i<k;i++)
        {
            temp[index++]=arr[i];
        }
        for (int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }
    }
}
