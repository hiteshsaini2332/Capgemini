package programmingpractice.lab1;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int fee=input.nextInt();
        int discountPercent=input.nextInt();
        int discount=(fee*discountPercent)/100;
        int discountedFee=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is "+discountedFee);

    }
}
