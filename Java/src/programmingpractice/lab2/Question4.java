package programmingpractice.Lab_2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double temperatureInCelsius=input.nextDouble();
        double temperatureInFahrenheit=(temperatureInCelsius*9/5)+32;
        System.out.println("The "+temperatureInCelsius+" celsius is "+String.format("%.2f",temperatureInFahrenheit)+" fahrenheit");
    }
}
