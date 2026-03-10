package march10practicequestions;

import java.util.*;

public class PositiveMid {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println(findMid(arr,n));
    }
    static int findMid(int[] arr,int n){
        ArrayList<Integer> list=new ArrayList<>();
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                list.add(arr[i]);
            }
        }
        int s=0;
        int e=list.size()-1;
        int mid=s+(e-1)/2;
        return  list.get(mid);
    }
}
