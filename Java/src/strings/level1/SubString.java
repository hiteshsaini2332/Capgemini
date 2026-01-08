package strings.level1;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String string=sc.next();
        System.out.println("Enter Starting index of Substring:");
        int startingIndex=sc.nextInt();
        System.out.println("Enter Ending index of Substring:");
        int endingIndex=sc.nextInt();
        String substringThroughLoop=SubStringUsingLoop(string,startingIndex,endingIndex);
        String substringThroughFunction=SubStringUsingFunction(string,startingIndex,endingIndex);
        if(substringThroughLoop.equals(substringThroughFunction)) System.out.println(substringThroughLoop+" and "+substringThroughFunction+" are same");
        else System.out.println(substringThroughLoop+" and "+substringThroughFunction+" are different");

    }
    static String SubStringUsingLoop(String str,int startingIndex,int endingIndex)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=startingIndex;i<=endingIndex;i++)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    static String SubStringUsingFunction(String str,int startingIndex,int endingIndex)
    {
        return str.substring(startingIndex,endingIndex+1);
    }
}
