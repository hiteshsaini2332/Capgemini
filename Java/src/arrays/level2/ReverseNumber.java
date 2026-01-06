package arrays.level2;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;

        // Step 1: Count digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Store digits
        int[] digits = new int[count];
        temp = num;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int number=0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        System.out.print("Reversed Number:");
        System.out.println(number);
    }
}
