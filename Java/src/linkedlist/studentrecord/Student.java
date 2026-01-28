package linkedlist.studentrecord;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private char grade;
    Student next;

    public Student(int rollNumber,String name,int age,char grade)
    {
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
