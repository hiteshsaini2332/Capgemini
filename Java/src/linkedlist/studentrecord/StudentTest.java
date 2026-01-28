package linkedlist.studentrecord;

import java.util.Scanner;

public class StudentTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();

        int choice, roll, age, pos;
        char grade;
        String name;

        while (true) {
            System.out.println("\n1.Insert Beginning\n2.Insert End\n3.Insert Position\n4.Delete\n5.Search\n6.Update Grade\n7.Display\n8.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.insertAtBeginning(roll, name, age, grade);
                    break;

                case 2:
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.insertAtEnd(roll, name, age, grade);
                    break;

                case 3:
                    pos = sc.nextInt();
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.insertAtPosition(roll, name, age, grade,pos);
                    break;

                case 4:
                    roll = sc.nextInt();
                    list.deleteByRollNo(roll);
                    break;

                case 5:
                    roll = sc.nextInt();
                    list.search(roll);
                    break;

                case 6:
                    roll = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.updateGrade(roll, grade);
                    break;

                case 7:
                    list.displayRecord();
                    break;

                case 8:
                    sc.close();
                    return;
            }
        }
    }
}
