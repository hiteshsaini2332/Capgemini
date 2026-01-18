package keywords;

public class Patient {
    static String hospitalName="Neelam";
    static int totalPatients;

    private String name;
    private int age;
    private final int patientID;
    private String ailment;

    Patient(String name,int age,int patientID,String ailment)
    {
        this.name=name;
        this.age=age;
        this.patientID=patientID;
        this.ailment=ailment;
        totalPatients++;
    }

    static int getTotalPatients()
    {
        return totalPatients;
    }

    public void displayPatientDetails(Object obj)
    {
        if(obj instanceof Patient)
        {
            System.out.println("Patient ID: "+patientID);
            System.out.println("Patient Name: "+name);
            System.out.println("Patient Age: "+age);
            System.out.println("Patient Ailment: "+ailment);
        }
    }
}
