package binarysearch;

import java.util.Arrays;

public class BinaryAndLinear {
    public static int findMissingPositive(int[]arr)
    {
        int []vis=new int[arr.length+1];
        for(int num:arr)
        {
            vis[num]++;
        }
        for(int i=1;i<=vis.length;i++)
        {
            if(vis[i]==0)return i;
        }
        return 0;
    }
    public static int search(int[]arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target)s=mid+1;
            else e=mid-1;
        }
        return -1;
    }

    static void main() {
        int[]arr={6,0,4,1,2,5,};
        System.out.println(findMissingPositive(arr));
        Arrays.sort(arr);
        int ans=search(arr,2);
        if(ans==-1) System.out.println("Target Not Found!!");
        else System.out.println("Target Found At Index: "+ans);
    }
}
