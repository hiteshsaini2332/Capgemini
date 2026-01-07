package javamethods.level2;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();


        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println("Year " + year + " is a Leap Year.");
        } else {
            System.out.println("Year " + year + " is NOT a Leap Year.");
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
