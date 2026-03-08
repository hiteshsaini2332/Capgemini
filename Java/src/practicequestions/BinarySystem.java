package practicequestions;

import java.util.Scanner;

public class BinarySystem {
    static void main() {
        Scanner  input = new Scanner(System.in);
        String str = input.nextLine();
        int ans=calculate(str);
        System.out.println(ans);
    }
    public static int calculate(String str) {
        if(str == null || str.length() % 2 == 0)return -1;
        int ans=str.charAt(0)-'0';
        int ind=1;
        for(int i=2;i<str.length();i+=2) {
            int t =str.charAt(i)-'0';
            char ch=str.charAt(ind);
            if(ch=='A')
            {
                ans=ans&t;
            } else if (ch=='B') {
                ans=ans|t;
            }
            else{
                ans=ans^t;
            }
            ind+=2;
        }
        return ans;
    }
}
