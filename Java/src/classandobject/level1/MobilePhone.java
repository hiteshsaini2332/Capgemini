package classandobject.level1;

public class MobilePhone {
    private String brand;
    private String model;
    private int price;

    MobilePhone(String brand,String model,int price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void displayMobileDetails()
    {
        System.out.println("Mobile's Brand: "+brand);
        System.out.println("Mobile's Model: "+model);
        System.out.println("Mobile's Price: "+price);
    }

    static void main() {
        MobilePhone m1=new MobilePhone("Realme","gtpro",40000);
        m1.displayMobileDetails();
        System.out.println(m1.brand);
    }
}
