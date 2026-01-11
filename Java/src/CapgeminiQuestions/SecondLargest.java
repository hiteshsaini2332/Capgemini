package CapgeminiQuestions;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int secondMax=findSecondLargest(arr,size);
        System.out.println(secondMax+" is the second largest element of array");
    }
    static int findSecondLargest(int[]arr,int size)
    {
        int max=0;
        int secondMax=0;
        for(int num:arr)
        {
            if(num>max)
            {
                secondMax=max;
                max=num;
            }
            else if(secondMax<num&& num!=max)secondMax=num;
        }
        return secondMax;
    }
}
