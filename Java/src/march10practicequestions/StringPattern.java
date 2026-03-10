package march10practicequestions;

import java.util.Scanner;

public class StringPattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findString(str));
    }
    static String findString(String str) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='1')
            {
                count++;
            }
            else{
                sb.append((char)(count-1+'A'));
                count=0;
            }
        }
        return sb.toString();
    }
}
