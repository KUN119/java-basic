package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(3000);
        System.out.println("balance = " + bankAccount.getBalance());

        bankAccount.deposit(6000);
        System.out.println("balance = " + bankAccount.getBalance());

        bankAccount.withdraw(4000);
        System.out.println("balance = " + bankAccount.getBalance());
    }
}
