package march10practicequestions;

import java.util.Scanner;

public class IsSubstring {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        if(isSub(str1,str2))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean isSub(String str1,String str2)
    {
        int index=str1.indexOf(str2);
        return index != -1;
    }
}
