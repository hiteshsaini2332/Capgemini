package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
        finally {
            scanner.close();
        }
    }

}
