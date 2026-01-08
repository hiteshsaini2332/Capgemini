package strings.level2;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        checkVowelsAndConsonants(string);
        int []count=countVowelsConsonants(string);
        System.out.println("Vowel count is "+count[0]+ " and Consonant count is "+count[1]);
    }
    static void  checkVowelsAndConsonants(String string)
    {
        String vowels="aeiou";
        for(char ch:string.toCharArray())
        {
            if(ch>='A'&& ch<='Z')
            {
                ch= (char) (ch+32);
            }
            if(vowels.indexOf(ch)!=-1)
            {
                System.out.println(ch+" is a vowel ");
            }
            else if(ch>='a'&& ch<='z')
            {
                System.out.println(ch+" is a consonant");
            }
            else{
                System.out.println(ch+" is not a letter");
            }
        }
    }
    static int[] countVowelsConsonants(String string) {
        int vowelCount = 0;
        int consonants = 0;
        String vowels = "aeiou";
        for (char ch : string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        return new int[]{vowelCount, consonants};
    }
}
