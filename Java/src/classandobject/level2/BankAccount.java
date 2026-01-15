package classandobject.level2;

public class BankAccount {
    final private String accountHolder;
    final private int accountNumber;
    private int balance;

    public BankAccount(String accountHolder,int accountNumber,int balance)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void depositMoney(int money)
    {
        balance+=money;
    }
    public void withdrawMoney(int money)
    {
        if(money>balance) {
            System.out.println("Insufficient Balance");
            return ;
        }
        balance-=money;
    }
    public void displayBalance()
    {
        System.out.println("Current Balance: "+balance);
    }
}
