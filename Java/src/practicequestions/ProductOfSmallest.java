package practicequestions;

import java.util.Scanner;

public class ProductOfSmallest {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum=input.nextInt();

        int ans=findProduct(sum,arr,n);
        System.out.println(ans);
    }
    static int findProduct(int sum, int[] arr, int n) {
        if(n<2) return -1;
        int mini1=Integer.MAX_VALUE;
        int mini2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<mini1){
                mini2=mini1;
                mini1=arr[i];
            }
            else if(arr[i]<mini2){
                mini1=arr[i];
            }
        }
        int s=mini1+mini2;
        if(s<sum){
            return mini2*mini1;
        }
        else{
            return 0;
        }
    }
}
