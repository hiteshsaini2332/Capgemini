package practicequestions;

import java.util.Scanner;

public class MaxEleAndIndex {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int []ans=findMax(arr,n);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    static int[] findMax(int[] arr, int n) {
        int maxEle=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxEle){
                maxEle=arr[i];
                maxIndex=i;
            }
        }
        return  new int[]{maxEle,maxIndex};
    }
}
