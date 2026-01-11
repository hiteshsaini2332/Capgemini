package CapgeminiQuestions;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverseArray(arr,size);
        System.out.println("After Reversing Array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void reverseArray(int []arr,int size)
    {
        int start=0;
        int end=size-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
