package march10practicequestions;

import java.util.Scanner;

public class HikeTrail {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int peak=findPeak(arr,n);
        System.out.println(peak);
    }
    static int findPeak(int[] arr,int n)
    {
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
               e=mid-1;
            }
        }
        return arr[s];
    }
}
