package programmingpractice.lab1;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numberOfStudents= input.nextInt();
        int numberOfHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("Number of possible handshakes among "+numberOfStudents+" students  are "+ numberOfHandshakes);

    }
}
