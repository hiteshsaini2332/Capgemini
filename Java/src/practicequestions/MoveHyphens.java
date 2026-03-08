package practicequestions;

import java.util.Scanner;

public class MoveHyphens {
    static void main() {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(move(str));
    }
    static String move(String str) {
        if(str==null)return null;

        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='-')
            {
                s1.append(ch);
            }
            else{
                s2.append(ch);
            }
        }
        s1.append(s2);
        return s1.toString();
    }
}
