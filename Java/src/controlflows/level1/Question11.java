package controlflows.level1;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        while(true)
        {
            double value= sc.nextDouble();
            if(value<=0)break;
            sum+=value;
        }
        System.out.println(sum);
    }
}
