package march10practicequestions;

import java.util.Scanner;

public class CaesarCipher {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convertToCipher(s));
    }
    static String convertToCipher(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'c') {
                int val=ch-'a'-3;
                int value=26+val;
                char newChar = (char)(value+'a');
                stringBuilder.append(newChar);
            }
            else if(ch>='d' && ch<='z') {
                int val=ch-'a';
                int value=val-3;
                char newChar=(char)(value+'a');
                stringBuilder.append(newChar);
            }
        }
        return stringBuilder.toString();
    }
}
