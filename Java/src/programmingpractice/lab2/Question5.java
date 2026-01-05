package programmingpractice.lab2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double temperatureInFahrenheit=input.nextDouble();
        double temperatureInCelsius=(temperatureInFahrenheit-32)*5/9;
        System.out.println("The "+temperatureInFahrenheit+" fahrenheit is "+String.format("%.2f",temperatureInCelsius)+" celsius");
    }
}
