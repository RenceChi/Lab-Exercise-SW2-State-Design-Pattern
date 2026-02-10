public class ActiveState implements AccountState {
    
    @Override
    public void deposit(double amount) {
        System.out.println("Deposit of $" + amount + " successful. Account is Active.");
    }
    
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawal of $" + amount + " successful. Account is Active.");
    }
    
    @Override
    public void suspend() {
        System.out.println("Account suspended.");
    }
    
    @Override
    public void activate() {
        System.out.println("Account is already Active.");
    }
    
    @Override
    public void close() {
        System.out.println("Account closed.");
    }
}