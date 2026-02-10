public interface AccountState {
   
    public void deposit(double amount);
    public void withdraw(double amount);
    public void suspend();
    public void activate();
    public void close();
}