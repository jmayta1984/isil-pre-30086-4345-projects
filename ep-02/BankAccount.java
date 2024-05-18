public class BankAccount {
    private String owner;
    private String account;
    private double balance;

    public BankAccount(String owner, String account, double balance) {
        this.owner = owner;
        this.account = account;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -=  amount;
            System.out.println("Su nuevo saldo es: " + balance);   

        } else {
            System.out.println("No se puede retirar el monto indicado.");   
        }
       
    }
    

}