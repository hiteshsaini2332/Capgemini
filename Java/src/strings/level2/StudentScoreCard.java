package strings.level2;

import java.util.Scanner;

public class StudentScoreCard {

    static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }
        return scores;
    }

    static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][4];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    static String[][] calculateGrades(double[][] results) {
        int students = results.length;
        String[][] grades = new String[students][1];

        for (int i = 0; i < students; i++) {
            double p = results[i][2];

            if (p >= 80) grades[i][0] = "A";
            else if (p >= 70) grades[i][0] = "B";
            else if (p >= 60) grades[i][0] = "C";
            else if (p >= 50) grades[i][0] = "D";
            else if (p >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    static void displayScoreCard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int)results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "%\t\t" +
                    grades[i][0]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);
    }
}
