package controlflows.level3;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;

        while (originalNumber != 0) {

            int digit = originalNumber % 10;

            sum = sum + (digit * digit * digit);

            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        }
        else {
            System.out.println(number + " is not an Armstrong Number");
        }

        sc.close();
    }
}
