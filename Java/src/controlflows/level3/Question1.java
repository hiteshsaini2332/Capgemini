package controlflows.level3;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        }
        else {

            System.out.println("Using multiple if-else:");

            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            }
            else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            }
            else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            }
            else {
                System.out.println("Year is not a Leap Year");
            }

            System.out.println("Using single if with logical operators:");

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year");
            }
            else {
                System.out.println("Year is not a Leap Year");
            }
        }

        sc.close();
    }
}

