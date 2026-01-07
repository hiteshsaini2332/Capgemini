package javamethods.level1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int rate= sc.nextInt();
        int time= sc.nextInt();
        int ans=calculate_simple_interest(principal,rate,time);
        System.out.println(ans);
    }
    static int calculate_simple_interest(int principal,int rate,int time)
    {
        return principal*rate*time;
    }
}
