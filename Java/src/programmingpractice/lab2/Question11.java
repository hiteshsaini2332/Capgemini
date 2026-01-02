package programmingpractice.Lab_2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int principal=input.nextInt();
        int rate=input.nextInt();
        int time=input.nextInt();

        int simpleInterest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and time "+time);

    }
}
