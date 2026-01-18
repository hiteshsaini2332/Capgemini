package keywords;

public class BankAccount {
    static String bankName="HDFC";
    static int totalAccounts=0;
    private String accountHolder;
    private final int accountNumber;

    BankAccount(String accountHolder,int accountNumber)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }

    static int getTotalAccounts()
    {
        return totalAccounts;
    }
    public void displayDetails()
    {
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Total Accounts: "+getTotalAccounts());
    }

    static void main() {
        BankAccount account=new BankAccount("John",123456);
        if(account instanceof BankAccount)
        {
            account.displayDetails();
        }
    }
}
