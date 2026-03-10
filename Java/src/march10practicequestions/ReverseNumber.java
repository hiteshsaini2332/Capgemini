package march10practicequestions;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(reverse(n));
    }
    static int reverse(int n) {
        int ans=0;
        while(n!=0){

            while(n%10==0){
                n=n/10;
            }
            ans=ans*10+n%10;
            n=n/10;
        }
        return ans;
    }
}
