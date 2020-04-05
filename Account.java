
public class Account {
	private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount){
        if(amount < 0) return false;
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount){
        if(amount > this.balance) return false;
        this.balance-=amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

}
