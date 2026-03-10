package march10practicequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicates {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[]ans=findArray(arr,n);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    static int[] findArray(int[] arr,int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        return list.stream().mapToInt(x->x).toArray();

    }
}
