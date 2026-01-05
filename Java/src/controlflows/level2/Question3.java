package controlflows.level2;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();


        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }

        sc.close();
    }
}
