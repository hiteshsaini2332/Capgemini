package practicequestions;

import java.util.Scanner;

public class TableOfNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum=calculateSum(number);
        System.out.println();
        System.out.println("The sum is "+sum);
    }
    static int calculateSum(int number) {
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(number*i+" ");
            sum+=number*i;
        }
        return sum;
    }
}
