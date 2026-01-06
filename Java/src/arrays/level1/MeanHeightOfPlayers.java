package arrays.level1;

import java.util.Scanner;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double []heights=new double[11];
        for (int i = 0; i < 11; i++) {
            heights[i]= sc.nextInt();
        }
        double sumOfHeights=0.0;
        for(double height:heights)
        {
            sumOfHeights+=height;
        }
        double meanOfHeights=sumOfHeights/11;
        System.out.println("Mean height of the football team is "+ meanOfHeights);
    }
}
