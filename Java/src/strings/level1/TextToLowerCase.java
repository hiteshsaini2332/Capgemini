package strings.level1;

import java.util.Scanner;

public class TextToLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String string=sc.next();
        String lowerUsingLoop=ConvertToLowerUsingLoop(string);
        String lowerUsingFunction=string.toLowerCase();
        if(CompareStrings(lowerUsingLoop,lowerUsingFunction)) System.out.println(lowerUsingLoop+" and "+lowerUsingFunction+" are same");
        else System.out.println(lowerUsingLoop+" and "+lowerUsingFunction+" are different");
    }
    static String ConvertToLowerUsingLoop(String string)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(ch>='A'&& ch<='Z')
            {
                ch= (char) ((char)ch+32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    static boolean CompareStrings(String str1,String str2)
    {
        return str1.equals(str2);
    }
}
