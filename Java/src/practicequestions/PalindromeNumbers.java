package practicequestions;

import java.util.Scanner;

public class PalindromeNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        findPalindromes(num1,num2);
    }
    static void findPalindromes(int num1, int num2) {
        for(int i=num1;i<=num2;i++)
        {
            if(isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPalindrome(int num) {
        int temp=num;
        int ans=0;
        while(temp!=0)
        {
            ans=ans*10+temp%10;
            temp=temp/10;
        }
        return ans==num;
    }
}
