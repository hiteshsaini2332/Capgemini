package strings.level2;
import java.util.Scanner;
public class TrimSpaces    {
    static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ')
            start++;

        while (end >= start && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] points = findTrimPoints(input);
        String customTrim = customSubstring(input, points[0], points[1]);

        String builtInTrim = input.trim();

        boolean result = compareStrings(customTrim, builtInTrim);

        System.out.println("Custom Trim Result: [" + customTrim + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrim + "]");
        System.out.println("Both are equal: " + result);
    }
}
