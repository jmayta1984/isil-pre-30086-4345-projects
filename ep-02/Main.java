public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Luis Camacho", "14894613", 1500);

        bankAccount.withdraw(1200);
    }
}