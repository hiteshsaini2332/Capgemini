package CapgeminiQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int missedNum=findMissing(arr,size);
        System.out.println("Missing Number in an array is "+missedNum);
    }
    static int findMissing(int[] num,int size)
    {
        Arrays.sort(num);
        for(int i=0;i<size;i++)
        {
            if(num[i]!=i+1)return i+1;
        }
        return 0;
    }

}
