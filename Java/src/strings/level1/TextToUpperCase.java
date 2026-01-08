package strings.level1;


import java.util.Scanner;

public class TextToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String string=sc.next();
        String upperUsingLoop=ConvertToUpperUsingLoop(string);
        String upperUsingFunction=string.toUpperCase();
        if(CompareStrings(upperUsingLoop,upperUsingFunction)) System.out.println(upperUsingFunction+" and "+upperUsingLoop+" are same");
        else System.out.println(upperUsingLoop+" and "+upperUsingFunction+" are different");
    }
    static String ConvertToUpperUsingLoop(String string)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(ch>='a'&& ch<='z')
            {
                ch= (char) ((char)ch-32);
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
