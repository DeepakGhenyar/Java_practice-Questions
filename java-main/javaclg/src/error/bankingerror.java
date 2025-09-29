package error;

// Custom exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient Funds! You tried to withdraw " + amount + 
                " but only " + balance + " is available."
            );
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}

public class bankingerror {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1200);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
