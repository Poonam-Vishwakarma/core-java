package lab;
// BankAccount interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

// CheckingAccount class implementing BankAccount interface
class CheckingAccount implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // method to get balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of CheckingAccount class
        CheckingAccount account = new CheckingAccount();

        // Deposit $500
        account.deposit(500);

        // Withdraw $200
        account.withdraw(200);

        // Withdraw $400
        account.withdraw(400);

        // Get the remaining balance
        System.out.println("Remaining balance: $" + account.getBalance());
    }
}
