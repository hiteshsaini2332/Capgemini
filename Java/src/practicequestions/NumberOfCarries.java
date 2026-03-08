package practicequestions;

import java.util.Scanner;

public class NumberOfCarries {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=findCarries(num1,num2);
        System.out.println(ans);
    }
    static int findCarries(int num1,int num2) {
        int carry = 0;
        int count = 0;
        int s = 0;
        while (num1 != 0 && num2 != 0) {
            int l1=num1%10;
            int l2=num2%10;
            int sum = l1 + l2 + carry;
            if (sum > 9) {
                s+=sum%10;
                count++;
                carry = sum / 10;
            }
            else {
                s+=sum;
            }
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return count;
    }
}
