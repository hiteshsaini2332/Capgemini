package CapgeminiQuestions;

import java.util.Scanner;

public class PascalTriangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int[][]triangle= generate(rows);
        for (int i = 0; i < rows; i++) {


            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generate(int numRows) {
        int[][] triangle = new int[numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        return triangle;
    }
}
