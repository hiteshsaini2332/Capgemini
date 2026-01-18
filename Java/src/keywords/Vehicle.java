package keywords;

public class Vehicle {
    static int registrationFee=399;

    private final int registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String ownerName,String vehicleType,int registrationNumber)
    {
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }

    static void updateRegistrationFee(int fee)
    {
        registrationFee=fee;
    }

    public void displayVehicleDetails(Object obj)
    {
        if(obj instanceof Vehicle)
        {
            System.out.println("Vehicle Owner Name: "+ownerName);
            System.out.println("Vehicle Type: "+vehicleType);
            System.out.println("Vehicle Registration Number: "+registrationNumber);
        }
    }
}
