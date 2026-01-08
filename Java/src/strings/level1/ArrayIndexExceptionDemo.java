package strings.level1;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    static String[] names;

    public static void generateException() {
        System.out.println(names[names.length + 1]);
    }

    public static void handleException() {
        try {
            System.out.println(names[names.length + 1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        names = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

//        generateException();

        handleException();
    }
}
