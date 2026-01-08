package strings.level2;

import java.util.Scanner;

public class VowelsConsonants2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        String[][]table=checkChar(string);
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " -> " + table[i][1]);
        }
    }
    static String[][] checkChar(String string)
    {
        String[][]table=new String[string.length()][2];
        String vowels="aeiou";
        int index=0;
        for(char ch:string.toCharArray())
        {
            if(ch>='A'&& ch<='Z')
            {
                ch= (char) (ch+32);
            }
            table[index][0]=String.valueOf(ch);
            if(vowels.indexOf(ch)!=-1)
            {
                table[index][1]="Is Vowel";
            }
            else if(ch>='a'&& ch<='z')
            {
                table[index][1]="is a Consonant";
            }
            else{
                table[index][1]="is not Letter ";
            }
            index++;
        }
        return table;
    }
}
