package arrays.level1;

import java.util.Scanner;

public class TwoDArrayTo1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int cols= sc.nextInt();
        int[][]twoDArray=new int[rows][cols];
        for(int row=0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                twoDArray[row][col]=sc.nextInt();
            }
        }
        int[]oneDArray=new int[rows*cols];
        int index=0;
        for(int row=0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                oneDArray[index++]=twoDArray[row][col];
            }
        }

        System.out.println("After converting 2D Array into 1D Array");
        for(int num:oneDArray)
        {
            System.out.print(num+" ");
        }
    }
}
