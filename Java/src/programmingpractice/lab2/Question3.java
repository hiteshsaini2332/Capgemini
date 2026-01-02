package programmingpractice.Lab_2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double number1= input.nextDouble();
        double number2= input.nextDouble();
        double number3= input.nextDouble();

        double firstOperation=number1+number2*number3;
        double secondOperation=number1*number2+number3;
        double thirdOperation=number3+number1/number2;
        double fourthOperation=number1%number2+number3;
        System.out.println("The results of INT Operations are "+firstOperation+", "+secondOperation+", "+thirdOperation+", "+fourthOperation);
    }
}
