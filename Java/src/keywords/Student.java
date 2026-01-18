package keywords;

public class Student {
    static String universityName="Chitkara";
    static int totalStudents=0;

    private String name;
    private final int rollNumber;
    private String grade;

    Student(String name,int rollNumber,String grade)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }

    static int getTotalStudents()
    {
        return totalStudents;
    }

    public void displayStudentDetails(Object obj)
    {
        if(obj instanceof Student)
        {
            System.out.println("Student Name: "+name);
            System.out.println("Student RollNumber: "+rollNumber);
            System.out.println("Student Grade: "+grade);
            System.out.println("Total Students: "+getTotalStudents());
        }
    }
}
