package strings.level1;

import java.util.Scanner;

public class StringIndexExceptionDemo {

    static String text;

    public static void generateException() {
        char ch = text.charAt(text.length() + 1);
        System.out.println(ch);
    }

    public static void handleException() {
        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();

        generateException();

        handleException();
    }
}

