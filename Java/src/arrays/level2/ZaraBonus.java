package arrays.level2;

import java.util.Scanner;

public class ZaraBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int EMPLOYEES = 10;

        double[] salary = new double[EMPLOYEES];
        double[] years = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double s = sc.nextDouble();

            System.out.print("Years of Service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < EMPLOYEES; i++) {

            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }


        System.out.println("\n----- Salary Report -----");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
