package strings.level2;

import java.util.Scanner;

public class ShortestLargestStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string =sc.nextLine();
        String[] stringArray=customSplit(string);
        String[][]wordTable=buildTable(stringArray);
        String[]ans=shortestAndLargest(wordTable);
        System.out.println("Shortest string is "+ans[0]+" and largest string is "+ans[1]);
    }
    static String[] customSplit(String string)
    {
        int len=findLength(string);
        int words = 0;

        if (len > 0 && string.charAt(0) != ' ') words++;

        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == ' ' && i + 1 < len && string.charAt(i + 1) != ' ')
                words++;
        }
        String[] result = new String[words];
        int index = 0;
        int start = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || string.charAt(i) == ' ') {
                if (start < i) {
                    result[index++] = string.substring(start, i);
                }
                start = i + 1;
            }
        }

        return result;
    }
    static int findLength(String string)
    {
        int count=0;
        for(char ch:string.toCharArray())
        {
            count++;
        }
        return count;
    }
    static String[][] buildTable(String[] strings)
    {
        String[][]table=new String[strings.length][2];
        for(int i=0;i<strings.length;i++)
        {
            int length=findLength(strings[i]);
            table[i][0]=strings[i];
            table[i][1]=String.valueOf(length);
        }
        return table;
    }
    static String[] shortestAndLargest(String[][] table)
    {
        String[] ans = new String[2];

        String shortest = table[0][0];
        String largest  = table[0][0];

        for (int i = 1; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);

            if (length > findLength(largest))
                largest = table[i][0];

            if (length < findLength(shortest))
                shortest = table[i][0];
        }

        ans[0] = shortest;
        ans[1] = largest;

        return ans;
    }

}
