package javamethods.level1;

import java.util.Scanner;

public class DistributeChocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of chocolates");
        int numberOfChocolates=sc.nextInt();
        System.out.println("Enter number of students ");
        int numberOfStudents= sc.nextInt();

        int []chocolatePerStudent=calculateChocolatePerStudent(numberOfChocolates,numberOfStudents);
        System.out.println("Each student will get "+chocolatePerStudent[0]+" chocolates and "+chocolatePerStudent[1]+" chocolates will remain");
    }
    static int[] calculateChocolatePerStudent(int numberOfChocolates,int numberOfStudents)
    {
        return new int[]{numberOfChocolates/numberOfStudents,numberOfChocolates%numberOfStudents};
    }
}
