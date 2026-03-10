package march10practicequestions;

import java.util.Scanner;

public class UpperAndLower {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(convertString(str1));
    }
    static String convertString(String str) {
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                upper++;
            }
            else if(ch>='a'&&ch<='z')
            {
                lower++;
            }
        }
        if(upper>lower){
           str= str.toUpperCase();
        }
        else if(lower>upper){
            str= str.toLowerCase();
        }
        return str;
    }
}
