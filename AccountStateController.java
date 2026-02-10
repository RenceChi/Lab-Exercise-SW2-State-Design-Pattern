public class AccountStateController {
    private String accountNumber;
    private double balance;
    private AccountState state;

    public AccountStateController(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.state = new ActiveState();
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public AccountState getState() {
        return state;
    }

    // Setters
    public void setState(AccountState state) {
        this.state = state;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Delegation methods - delegate to current state
    public void deposit(double amount) {
        state.deposit(amount);
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public void suspend() {
        state.suspend();
        this.state = new SuspendedState();
    }

    public void activate() {
        state.activate();
        this.state = new ActiveState();
    }

    public void close() {
        state.close();
        this.state = new ClosedState();
    }
}