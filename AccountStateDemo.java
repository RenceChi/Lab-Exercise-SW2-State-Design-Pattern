public class AccountStateDemo {
    public static void main(String[] args){
        AccountStateController account = new AccountStateController("ACC001", 500.0);

        //initial state
        account.activate();

        //suspend the account
        account.suspend();

        //Activate the account 
        account.activate();

        //Deposit to the Account
        account.deposit(200.0);

        //withdraw from the Account
        account.withdraw(100.0);

        //Close the Account
        account.close();

        //Activate Account
        account.activate();

        //Suspend the Account
        account.suspend();
        
        //withdraw from the Account
        account.withdraw(100.0);
    
        //Deposit to the Account
        account.deposit(50.0);
    }
}