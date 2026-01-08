package strings.level2;

import java.util.Scanner;

public class CanStudentVote {
    static int[] generateAges(int[] inputAges) {
        int[] ages = new int[inputAges.length];
        for (int i = 0; i < inputAges.length; i++) {
            ages[i] = inputAges[i];
        }
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] table = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            table[i][0] = String.valueOf(age);

            if (age < 0) {
                table[i][1] = "false";
            }
            else if (age >= 18) {
                table[i][1] = "true";
            }
            else {
                table[i][1] = "false";
            }
        }

        return table;
    }

    static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] inputAges = new int[10];

        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < 10; i++) {
            inputAges[i] = sc.nextInt();
        }

        int[] ages = generateAges(inputAges);
        String[][] resultTable = checkVoting(ages);
        displayTable(resultTable);
    }
}
