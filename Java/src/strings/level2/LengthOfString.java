package strings.level2;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
}
