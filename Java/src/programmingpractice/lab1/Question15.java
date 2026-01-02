package programmingpractice.lab1;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double totalPrice=input.nextDouble();
        int quantity= input.nextInt();
        double unitPrice=totalPrice/quantity;
        System.out.println("The total purchase is INR "+totalPrice+" if the quantity "+quantity+" and the unit price is INR "+String.format("%.2f",unitPrice));
    }
}
