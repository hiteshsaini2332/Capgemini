package classandobject.level2;

public class Student {
    final private String name;
    private int rollNumber;
    private int marks;

    Student(String name,int rollNumber,int marks)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    public char calculateGrades()
    {
        if(marks>=90 && marks<=100)
        {
            return 'O';
        }
        else if(marks>=80&&marks<90)
        {
            return 'A';
        }
        else if(marks>=70&&marks<80)
        {
            return 'B';
        }
        else if (marks>=60&&marks<70) {
            return 'C';
        }
        else if(marks>=50&&marks<60)
        {
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public void displayStudentDetails()
    {
        System.out.println("Student's name: "+name);
        System.out.println("Student's roll number: "+rollNumber);
        System.out.println("Student's marks: "+marks);
        System.out.println("Student's grades: "+calculateGrades());
    }
}
