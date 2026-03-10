package march10practicequestions;

import java.util.Scanner;

public class LongestWord {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(extractWord(str));
    }
    static String extractWord(String str) {
        if(str.length()<10)return str;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int len=str.length()-2;
        sb.append(len);
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}
