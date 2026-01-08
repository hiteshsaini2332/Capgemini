package strings.level2;
import java.util.Scanner;
public class StringLengthTable {
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

            String[] result = new String[words];
            int index = 0;
            int start = 0;

            for (int i = 0; i <= len; i++) {
                if (i == len || text.charAt(i) == ' ') {
                    if (start < i) {
                        result[index++] = text.substring(start, i);
                    }
                    start = i + 1;
                }
            }

            return result;
        }
        public static String[][] buildTable(String[] words) {
            String[][] table = new String[words.length][2];

            for (int i = 0; i < words.length; i++) {
                int length = findLength(words[i]);
                table[i][0] = words[i];
                table[i][1] = String.valueOf(length);
            }

            return table;
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            String[] words = customSplit(input);
            String[][] table = buildTable(words);

            System.out.println("Word\tLength");

            for (int i = 0; i < table.length; i++) {
                String word = table[i][0];
                int len = Integer.parseInt(table[i][1]);
                System.out.println(word + "\t" + len);
            }
        }
}
