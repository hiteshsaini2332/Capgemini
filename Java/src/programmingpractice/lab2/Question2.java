package programmingpractice.lab2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number1= input.nextInt();
        int number2= input.nextInt();
        int number3= input.nextInt();

        int firstOperation=number1+number2*number3;
        int secondOperation=number1*number2+number3;
        int thirdOperation=number3+number1/number2;
        int fourthOperation=number1%number2+number3;
        System.out.println("The results of INT Operations are "+firstOperation+", "+secondOperation+", "+thirdOperation+", "+fourthOperation);

    }
}
