public class BankAccount {

    private int balance;

    public BankAccount(){
        setBalance(2000);
    }

    private int getBalance(){
        return balance;
    }

    private void setBalance( int newBalance ){
        balance = newBalance;
    }

    public void deposit( int amount ){
        setBalance( balance + amount);
    }

    public void withdraw( int amount ){
        setBalance( balance - amount);
    }

    public int checkBalance(){
        return getBalance();
    }
}
