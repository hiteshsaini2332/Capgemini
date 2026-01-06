package arrays.level1;

import java.util.Scanner;

public class PeopleCanVoteOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []student=new int[10];
        for(int i=0;i<10;i++)
        {
            student[i]= sc.nextInt();

        }
        for(int i=0;i<10;i++)
        {
            if(student[i]<0) System.out.println("Invalid Age");
            else if(student[i]<18) System.out.println("The Student with age "+student[i]+" cannot vote");
            else System.out.println("The Student with age "+student[i]+" can vote");
        }


    }
}
