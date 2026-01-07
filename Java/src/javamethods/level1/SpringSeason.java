package javamethods.level1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month: ");
        int month=sc.nextInt();
        System.out.println("Enter day: ");
        int day= sc.nextInt();
       if(checkSpringSeason(month,day))
       {
           System.out.println("Spring Season");
       }
       else {
           System.out.println("Not A Spring Season");
       }
    }
    static boolean checkSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
    }
}
