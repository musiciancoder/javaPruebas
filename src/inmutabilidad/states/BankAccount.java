package inmutabilidad.states;

//Example for External State (with public methods to modify state):

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) { //notar q son publicos y reciben una cantidad desde el exterior
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) { //notar q son publicos y reciben una cantidad desde el exterior,  es decir el estado es manipulado desde el exterior
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Public method to access the external state
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Initial balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

