package practicequestions;

import java.util.Scanner;

public class SumOfNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=calculate(a,b);
        System.out.println(sum);
    }
    static int calculate(int a,int b){
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(i%3==0&&i%5==0)
                sum+=i;
        }
        return sum;
    }
}
