package practicequestions;

import java.util.Scanner;

public class AbsoluteDiff {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int num=sc.nextInt();
        int diff=sc.nextInt();

        int ans=findCount(arr,n,num,diff);
        System.out.println(ans);
    }
    static int findCount(int[] arr,int n,int num,int diff){
        int ans=0;
        for(int i=0;i<n;i++){
            int d=Math.abs(num-arr[i]);
            if(d<=diff)
            {
                ans++;
            }
        }
        return ans==0?-1:ans;
    }
}
