package practicequestions;

import java.util.Scanner;

public class RatsFood {
    static void main() {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int u=input.nextInt();
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int index=minHouses(r,u,arr);
        System.out.println(index);
    }
    static int minHouses(int r,int u,int[] arr){
        int food=r*u;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=food){
                return i+1;
            }
        }
        return -1;
    }
}
