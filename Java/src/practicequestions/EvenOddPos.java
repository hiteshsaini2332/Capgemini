package practicequestions;

import java.util.Scanner;

public class EvenOddPos {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        int ans=findSum(arr,n);
        System.out.println(ans);
    }
    static int findSum(int[] arr,int n) {
        if(n<=3)return 0;
        int maxi1=Integer.MIN_VALUE;
        int mini1=Integer.MAX_VALUE;
        int maxi2=Integer.MIN_VALUE;
        int mini2=Integer.MAX_VALUE;
        for(int i=0;i<n;i+=2) {
            if(arr[i]>maxi1){
                maxi2=maxi1;
                maxi1=arr[i];
            }
            else if(arr[i]>maxi2){
                maxi2=arr[i];
            }
        }
        for(int i=1;i<n;i+=2) {

            if (arr[i] < mini1) {
                mini2 = mini1;
                mini1 = arr[i];
            } else if (arr[i] < mini2) {
                mini2 = arr[i];
            }
        }
        return maxi2+mini2;
    }
}
