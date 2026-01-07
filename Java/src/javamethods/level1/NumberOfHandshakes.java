package javamethods.level1;

import java.util.Scanner;

public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents= sc.nextInt();
        int handshakes=calculatePossibleHandshakes(numberOfStudents);
        System.out.println(handshakes);
    }
    static int calculatePossibleHandshakes(int numberOfStudents)
    {
        return numberOfStudents*(numberOfStudents-1)/2;
    }
}
