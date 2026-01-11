package CapgeminiQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        findDuplicates(arr,size);
    }
    static void findDuplicates(int[]arr,int size)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+" is duplicate");
            }
        }
    }
}
