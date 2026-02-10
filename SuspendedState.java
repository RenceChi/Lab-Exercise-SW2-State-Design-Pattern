public class SuspendedState implements AccountState{
    @Override
    public void suspend() {
        System.out.println("Account is already suspended.");
    }
    @Override
    public void activate() {
        System.out.println("Account is activated.");
    }
    @Override
    public void close() {
        System.out.println("Account is closed.");
    }
    @Override
    public void deposit(double amount) {
        System.out.println("Cannot deposit. Account is suspended.");
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw. Account is suspended.");
    }
}