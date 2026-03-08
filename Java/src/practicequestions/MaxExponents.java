package practicequestions;

import java.util.Scanner;

public class MaxExponents {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans=findMax(a,b);
        sc.close();
        System.out.println(ans);
    }
    static int findMax(int a,int b){
        int max=0;
        int maxNum=0;
        for(int i=a;i<=b;i++){
            int count=0;
            int num=i;
            while (num % 2 == 0) {
                count++;
                num /= 2;
            }
            if(count>max){
                max=count;
                maxNum=i;
            }
            else if(count==max){
                maxNum=Math.min(i,maxNum);
            }
        }
        return maxNum;
    }
}
