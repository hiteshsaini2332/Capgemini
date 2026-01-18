package keywords;

public class Employee {
    static String companyName="Capgemini";
    static int totalEmployees=0;
    private String name;
    private final int id;
    private String designation;

    Employee(String name,int id,String designation)
    {
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }

    static int displayTotalEmployees()
    {
        return totalEmployees;
    }

    public void displayEmployeeDetails(Object obj)
    {
        if(obj instanceof Employee)
        {
            System.out.println("Employee Name: "+name);
            System.out.println("Employee ID: "+id);
            System.out.println("Employee Designation: "+designation);
            System.out.println("Total Employee: "+displayTotalEmployees());
        }
    }
}
