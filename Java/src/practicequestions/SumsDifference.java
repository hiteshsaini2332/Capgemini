package practicequestions;

import java.util.Scanner;

public class SumsDifference {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans=findDiff(n,m);
        System.out.println(ans);
    }
    static int findDiff(int n,int m){
        int s1=0;
        int s2=0;
        for(int i=1;i<=m;i++){
            if(i%n==0)
            {
                s1+=i;
            }
            else{
                s2+=i;
            }
        }
        return Math.abs(s1-s2);
    }
}
