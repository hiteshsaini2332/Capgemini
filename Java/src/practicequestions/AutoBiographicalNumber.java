package practicequestions;

import java.util.Scanner;

public class AutoBiographicalNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
       String str = input.nextLine();
       int ans=findNumber(str);
        System.out.println(ans);
    }
    static int findNumber(String str) {
        int[]freq=new int[10];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-'0']++;
        }
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)-'0')!=freq[i])return 0;
        }
        int count=0;
        for(int temp:freq)
        {
            if(temp!=0)count++;
        }
        return count;
    }
}
