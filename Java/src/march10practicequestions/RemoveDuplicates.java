package march10practicequestions;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDuplicate(str));
    }
    static String removeDuplicate(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                sb.append(ch);
            }
            set.add(ch);
        }
        return sb.toString();
    }
}
