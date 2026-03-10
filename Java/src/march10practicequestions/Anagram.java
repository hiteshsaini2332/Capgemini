package march10practicequestions;

import java.util.Scanner;

public class Anagram {
    static void main() {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if(isAnagram(str1,str2))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        int []freq=new int[26];
        for(int i=0;i<str1.length();i++)
        {
            freq[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            freq[ch-'a']--;
            if(freq[ch-'a']<0)
                return false;
        }
        for(int i:freq){
            if(i!=0)
                return false;
        }
        return true;
    }
}
