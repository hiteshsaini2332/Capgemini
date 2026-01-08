package strings.level1;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first String:");
        String string1=sc.next();
        System.out.println("Enter second String");
        String string2=sc.next();
        boolean usingLoop=CompareStringUsingLoop(string1,string2);
        boolean usingBuiltInFunction=CompareStringsUsingBuiltInFunction(string1,string2);
        if(usingLoop==usingBuiltInFunction)
        {
            System.out.println("Both results are same");
        }
        else{
            System.out.println("Results are different");
        }
    }
    static boolean CompareStringUsingLoop(String str1,String str2)
    {
        if(str1.length()!=str2.length())return false;
        for(int i=0;i<str1.length();i++)
        {
            char charOfStr1=str1.charAt(i);
            char charOfStr2=str2.charAt(i);
            if(charOfStr1!=charOfStr2)return false;
        }
        return true;
    }
    static boolean CompareStringsUsingBuiltInFunction(String str1,String str2)
    {
        if(str1.length()!=str2.length())return false;
        return str1.equals(str2);
    }
}
