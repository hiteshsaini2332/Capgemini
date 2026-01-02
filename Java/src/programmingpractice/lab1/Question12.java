package programmingpractice.lab1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int baseInCm= input.nextInt();
        int heightInCm= input.nextInt();

        double baseInInches=baseInCm/2.54;
        double heightInInches=heightInCm/2.54;

        double areaInCm2 = 0.5*baseInCm*heightInCm;
        double areanInInches2 = 0.5*baseInInches*heightInInches;

        System.out.println("Area of Triangle in Cm2 "+String.format("%.2f",areaInCm2)+"and in Inches2 "+String.format("%.2f",areanInInches2));
    }
}
