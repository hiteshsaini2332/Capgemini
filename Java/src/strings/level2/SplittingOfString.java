package strings.level2;
import java.util.Scanner;
public class SplittingOfString {

        public static int findLength(String s) {
            int count = 0;
            try {
                while (true) {
                    s.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }

        public static String[] customSplit(String text) {
            int len = findLength(text);
            int words = 0;

            if (len > 0 && text.charAt(0) != ' ') words++;

            for (int i = 0; i < len; i++) {
                if (text.charAt(i) == ' ' && i + 1 < len && text.charAt(i + 1) != ' ')
                    words++;
            }

            int[] spaces = new int[words + 1];
            int index = 1;
            spaces[0] = -1;

            for (int i = 0; i < len; i++) {
                if (text.charAt(i) == ' ')
                    spaces[index++] = i;
            }

            spaces[index] = len;

            String[] result = new String[words];
            int w = 0;

            for (int i = 0; i < index; i++) {
                int start = spaces[i] + 1;
                int end = spaces[i + 1];
                if (start < end)
                    result[w++] = text.substring(start, end);
            }

            return result;
        }

        public static boolean compareArrays(String[] a, String[] b) {
            if (a.length != b.length) return false;

            for (int i = 0; i < a.length; i++) {
                if (!a[i].equals(b[i])) return false;
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();

            String[] custom = customSplit(input);
            String[] builtin = input.split(" ");

            boolean result = compareArrays(custom, builtin);

            System.out.println(result);
        }
    }

