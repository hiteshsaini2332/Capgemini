package strings.level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    static String text;

    public static void generateException() {
        String s = text.substring(5, 2);
        System.out.println(s);
    }

    public static void handleException() {
        try {
            String s = text.substring(5, 2);
            System.out.println(s);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();

        generateException();

        handleException();
    }
}
