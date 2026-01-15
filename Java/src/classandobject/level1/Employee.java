package classandobject.level1;

public class Employee {
    private String name;
    private int id;
    private int salary;

    Employee(String name,int id,int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails()
    {
        System.out.println("Employee's name :"+name);
        System.out.println("Employee's id: "+id);
        System.out.println("Employee's salary: "+salary);
    }
}

