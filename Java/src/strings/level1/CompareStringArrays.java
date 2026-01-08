package strings.level1;

import java.util.Scanner;

public class CompareStringArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String string=sc.next();
        char[]arrayUsingLoop=BuildArrayUsingLoop(string);
        char[] arrayUsingFunction=string.toCharArray();
        if(CompareArrays(arrayUsingFunction,arrayUsingLoop)) System.out.println("Arrays are same");
        else System.out.println("Arrays are different");
    }
    static char[] BuildArrayUsingLoop(String string)
    {
        char[]ans=new char[string.length()];
        for(int index=0;index<string.length();index++)
        {
            ans[index]=string.charAt(index);
        }
        return ans;
    }
    static boolean CompareArrays(char[]array1,char[]array2)
    {
        if(array2.length!=array1.length)return false;
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]!=array2[i])return false;

        }
        return true;
    }
}
